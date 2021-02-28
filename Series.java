package arrays;
/*
 * 9 	33 		73 		129 	201
 *   24		40		56		72
 *   	16		16		16
 */
public class Series {

	public static void main(String[] args)
	{
	int a=9;
	int b=24;
	int n=3;
	for (int i = 0; i < n-1; i++)
	{
		a=a+b;
		b=b+16;
	}
	System.out.println(a);
	}

}
