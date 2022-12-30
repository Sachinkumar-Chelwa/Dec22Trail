package arithmaticoperators;

public class Relationaloperators {
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=40;
//	System.out.println(a<b);
	//System.out.println(a>b);
//	System.out.println(a<=b);
//	System.out.println(c>=b);
//	System.out.println(a==b);
	//System.out.println(a!=c);
	//	System.out.println(a<b && c>a);
//		System.out.println(b<a && c<a);
	//	System.out.println(c>a && b<a);
  //      System.out.println(c<b && c>a);
		
        System.out.println(a<b || c>a);
		System.out.println(b<a || c<a);
		System.out.println(c>a || b<a);
        System.out.println(c<b || c>a);
		
		
	}

}




