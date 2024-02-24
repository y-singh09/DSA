
import java.util.Arrays;
import java.util.ArrayList;
public class merge_interval {

	public static void main(String[] args) {
		int [][] a={{1,3},{2,6},{8,10},{15,18}};
		int[][] ans = merged_array(a);
		for(int[] i : ans)
		{
			System.out.print(Arrays.toString(i));  // It is used to print the merged array
		}
		
	}
	static int[][] merged_array(int[][] a)
	{
		if(a.length==0||a==null)
		{
			return new int[0][0];
		}
		Arrays.sort(a,(m,n)->m[0]-n[0]);  // It is used to sort on the basis of m and n 
							(jaha m bara hai aur n chota)
						       m and n are values of two different interval.
		ArrayList<int[]> list=new ArrayList<int[]>();
		list.add(a[0]);
		for(int i=1;i<a.length;i++)
		{
			int[] current=a[i];
			int[] last=list.get(list.size()-1);
			if(current[0]<=last[1])
			{
				last[1]=Math.max(current[1], last[1]);
			}
			else {
				list.add(current);
			}
		}
		int[][] res=new int[list.size()][2];
		for(int i=0;i<list.size();i++)
		{
			res[i]=list.get(i);
		}
		return res;
	}

}
