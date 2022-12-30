package methods;

public class Parameters1 {
	public void Substractionnonstaticmethod(int a, int b) {
		int sub=a-b;
		System.out.println(sub);
		
	}
	public static void main(String[] args) {
		Parameters1 object= new Parameters1();
		object.Substractionnonstaticmethod(20,10);
	}

}
