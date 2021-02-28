package arrays;
import java.util.Arrays;
public class MultipleOccRemoveOneOrTwoQP 
{
	public static void main(String[] args) 
	{
	int[] a= {1,1,1,1,1,2,2,3,4};
	int[] n= {1,2,4};
	
	for (int i = 0; i < n.length; i++)
	{
		int m=n[i];
		int cnt=0;
		for (int j = 0; j < a.length; j++)
		{
			if(a[j]==m)
				cnt++;
		}
		if(cnt==1)
		{
			int index=0;
			int[] b=new int[a.length-1];
		for (int j = 0; j < a.length; j++)
		{
			if(a[j]!=m)
				b[index++]=a[j];
		}
		a=b;
		}
		else if(cnt>=2)
		{
			int index=0;
			int[] b=new int[a.length-2];
			int mycount=0;
			for (int j = 0; j < a.length; j++)
			{
				if(a[j]!=m || mycount>=2)
					b[index++]=a[j];
				else
					mycount++;
			}
			a=b;
		}
	}
	System.out.println(Arrays.toString(a));
	}
}