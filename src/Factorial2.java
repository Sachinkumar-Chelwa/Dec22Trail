import java.util.Scanner;
public class Factorial2 {
	public static void main(String[] args) {
		Scanner object=new Scanner(System.in);
		System.out.println("enter the number");
		int num=object.nextInt();
		int fact=1;
		
		for (int i=num;i>=1;i--) {
			fact=fact*i;
			
		}
		System.out.println(fact);
	}
	

}
