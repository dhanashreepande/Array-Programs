package arrays;

public class InsertionSort {

	public static void main(String[] args)
	{
		int a[]= {3,5,7,2,9,1,4};
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i; j > 0; j--)
			{
				if(a[j]>a[j-1])
					break;
				else
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
	}
for (int i : a) {
	System.out.println(i);
}

}
}
