package methods;
import com.java.method5.Sample1;
public class Sameclass {
public static void Sameclassstaticmethod() {
	System.out.println("method is static");
	
}
public static void main(String[] args) {
	System.out.println("start of the programme");
	Sameclassstaticmethod();
	Diffclass.Diffclassstaticmethod();
	Sample1.multiplication();
	System.out.println("end of the programme");
}
}
