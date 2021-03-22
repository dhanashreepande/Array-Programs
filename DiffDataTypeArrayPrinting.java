package arraypractice;
import java.util.Arrays;
public class DiffDataTypeArrayPrinting {
	public static void main(String[] args){
	int[] a= {1,2,3,4};
	String[] s= {"as","sdf","sdsf","erfeg"};
	char[] c= {'d','g','t','w'};
	boolean[] b= {true,false,true,false};
	double[] d= {23.4,34.53,53.6,64.7};
	System.out.println(Arrays.toString(d)+"\n"+Arrays.toString(c)
	+"\n"+Arrays.toString(b)+"\n"+Arrays.toString(a)+"\n"+Arrays.toString(s));
	}
}
