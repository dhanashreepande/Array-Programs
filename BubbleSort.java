package arrays;

public class BubbleSort
{
	public static void main(String[] args) 
	{
		int a[]= {3,5,7,2,9,1,4};
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length-1-i; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for (int i : a) {
			System.out.println(i);
		}

	}

}
