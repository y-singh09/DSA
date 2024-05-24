import java.util.*;

public class spiral {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        spiral(arr);
    }

    static void spiral(int[][] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        int top = 0;
        int left = 0;
        int bottom = m - 1;
        int right = n - 1;
        
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                list.add(arr[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                list.add(arr[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(arr[bottom][i]);
                }
                bottom--;
            }
            
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(arr[i][left]);
                }
                left++;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
