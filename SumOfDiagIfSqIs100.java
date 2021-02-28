package arrays;

public class SumOfDiagIfSqIs100 
{
	private static boolean prime(int sum) 
	{
		boolean flag=true;
		for (int k = 2; k < sum; k++)
		{
			if(sum%k==0)
				flag=false;
		}
		return flag;
	}
	public static void main(String[] args) 
	{
		int[][] a= {{1,2,3},
					{3,6,7},
					{11,5,7}};
		int sum=0;
	for (int i = 0; i < a.length; i++)
	{
		for (int j = 0; j < a.length; j++)
		{
			if(i==j && prime(a[i][j]) && a[i][j]*a[i][j]<100)
			{	sum=sum+a[i][j];
			}else if(i+j==2 && prime(a[i][j]) && a[i][j]*a[i][j]<100) {
				sum=sum+a[i][j];
			}
		}
	}
	System.out.println(sum);
	}
}
