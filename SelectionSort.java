package arrays;

public class SelectionSort {

	public static void main(String[] args)
	{
	int a[]= {3,5,7,2,9,1,4};
	for (int i = 0; i < a.length; i++)
	{
		int min=i;
		for (int j = i+1; j < a.length; j++)
		{
			if(a[j]<a[min])
				min=j;
		}
		int temp=a[min];
		a[min]=a[i];
		a[i]=temp;
	}
	for (int i : a) {
		System.out.println(i);
	}
	}

}
