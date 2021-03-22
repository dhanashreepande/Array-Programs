package arraypractice;
public class PrimeNumberInArrayWithSum {
	public static void main(String[] args) {
		int n=2, k=3;
		int arraysize=1, arraycount=0;
		int sum=0,count=0;
		while(true){
			if(isPrime(n)){
				arraycount++;
				if(arraysize==k)
					sum=sum+n;
				if(arraycount==arraysize){
					arraysize++;
					if(arraysize>k)
						break;
					arraycount=0;
				}
				count++;
			}
			n++;
		}	System.out.println(sum);
	}
	private static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}
