import methods.Sameclass1;
public class Nonstaticmethod {
	public void nonstaticmethodaddition(int a,int b) {
		
		int sum=a+b;
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		 Nonstaticmethod object=new  Nonstaticmethod();
		 object.nonstaticmethodaddition(20,20);
		 Additionstaticmethod.Addition();
		 Sameclass1.main(args);
	}

}
