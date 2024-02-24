package DSA;

public class Jump_array {

	public static void main(String[] args) {
		int [] a=  {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int n=a.length;
		 System.out.println("Minimum number of jumps: " + min_jump(a));
	}
	static int min_jump(int[] a )
	{    
		
		if(a[0]==0)
		{
			return -1;  //can't Move Forward
		}
		if(a.length<=1)
		{
			return 0;
		}
		int max=a[0];
		int step=a[0];
		int jump=1;
		for(int i=1;i<a.length;i++)
		{
			if(i==a.length-1)
			{
				return jump;
			}
			max=Math.max(max,i+a[i]);
			step--;
			if(step==0)
			{
				jump++;
			
			if(i>=max)   //if we can't reach the end
			{
				return -1;
			}
			step=max-i;
		}
		}
		return -1;
	}

}
