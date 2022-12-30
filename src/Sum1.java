import java.util.Scanner;
public class Sum1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		int sum=0;
		for(int i=num;i>=1;i--) {
			sum=sum+i;
		}
		System.out.println(sum);
		
	}

}
