import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		int count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		for(int i=a;i<=b;i++) {
			if(i%2==0 && i%2!=0) {
				
				System.out.println(i);
				count++;
				
			}

			
		}
		System.out.println("count of numbers="+count);
	}
	

}
