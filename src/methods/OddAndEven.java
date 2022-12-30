package methods;
//1-100


public class OddAndEven {
	public static void Even(int a,int b) {
		for (int i=a;i<=b;i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		
			
		}
	public static void Odd(int a, int b) {
		for (int j=a;j<=b;j++) {
			if (j%2!=0) {
				System.out.println(j);
			}
		}
		
		
	}
	public static void main(String[] args) {
		Even(1,100);
		Odd(1,100);
	}

}
