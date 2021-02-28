package arrays;

import java.util.Arrays;

public class PosNegQP {

	public static void main(String[] args) 
	{
	int a[]= {9,-1,3,6,-6,7,-2,-4,5};
	for (int i = 0; i < a.length; i++) 
	{
			for (int j = 0; j < a.length; j++) 
			{
				if(i<j && a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
				if(i<j && a[i]>a[j] && a[i]>0 && a[j]>0)
				{
					int t= a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
	System.out.println(Arrays.toString(a));

	}

}
