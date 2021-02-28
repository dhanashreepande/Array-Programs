package arrays;

public class MultiplicationMatrix
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
	int[][] a= {{1,2},
				{3,4}
	};
	
	int[][] b= {{4,5},
				{6,7}
	};
	
	int[][] c=new int[2][2];
	
	for (int i = 0; i <b.length; i++)
	{
		for (int j = 0; j < b.length; j++) 
		{
			int sum=0;
			for (int k = 0; k < b.length; k++)
			{	sum=sum+a[i][k]*b[k][j];
			}
			if(sum%2==0)
			{	sum=sum/2;
			}
			else if(prime(sum))
			{
				sum=sum*3;
			}
			else 
			{	sum=sum*2;
		}
			c[i][j]=sum;
		}
	}
	for (int i = 0; i < c.length; i++)
	{
		for (int j = 0; j < c.length; j++)
		{
			System.out.print(c[i][j]+" ");
			
		}
		System.out.println();
	}
	}
}