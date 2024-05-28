

public class sum_subarray {

	public static void main(String[] args) {
		int a[]={1,2,3,-2,5 };
		int sum=0;
		int n=a.length;
		int max=Integer.MIN_VALUE;
		
		//MINIMUM VALUE OF INT IN JAVA//
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
			if(max<sum)
			{ 
				
				max=sum;
			}
			if(sum<0)
			{
				sum=0;
			}
		}
		System.out.print(max);


	}
}
