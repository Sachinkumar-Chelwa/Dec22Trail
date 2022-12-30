import java.util.Scanner;
public class Sum {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int a=scan.nextInt();
	int count=0;
	int sum=0;
	for(int i=a;i>=1;i--) {
		
		sum=sum+i;
		count++;
	}
	System.out.println(sum);
	System.out.println("count of number="+count);
	
}
	
}

