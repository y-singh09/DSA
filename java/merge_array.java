
public class merge_array {

    public static void main(String[] args) {
        int a[] = {-1,0,0,3,3,3,0,0,0}; 
        int b[]= {2,4,6};
        int m = a.length;  
        int n = b.length; 

        
        merge(a, m, b, n);

       
        }
   

   //Zeros from the array se hatane ke liye ek function:
    
    
    public static int countMeaningfulElements(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

//Merge sort
    public static void merge(int[] a, int m, int[] b, int n) {
        int i = 0, j = 0, k = 0;
        int p=countMeaningfulElements(a);
       int q=n;
       int c[] = new int[p+q];  // New array to hold the merged result
        // Merge the arrays
        while (i < p && j < q) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        // Bacha hua elements
        while (i < p) {
            c[k++] = a[i++];
        }

       
        while (j < q) {
            c[k++] = b[j++];
        }
        // Print the merged array
        for (int num : c) {
            System.out.print(num + " ");
    }
}
}
