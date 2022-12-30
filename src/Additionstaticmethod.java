import java.util.Scanner;
public class Additionstaticmethod {
	public static void Addition() {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the numbers");
	int a=scan.nextInt();
	int b=scan.nextInt();
	int sum=a+b;
	System.out.println(sum);
	}
	public static void main(String[] args) {
		Addition();
	}
	

}
