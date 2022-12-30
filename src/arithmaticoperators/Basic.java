package arithmaticoperators;
import java.util.Scanner;
public class Basic {
	public void factorial(int num) {
		int fact=1;
		
		
		for(int i=num;i>=1;i--) {
			fact=fact*i;
	}
		System.out.println(fact);
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		Basic a=new Basic();
a.factorial(num);
		
			
			
		}
		
	}


