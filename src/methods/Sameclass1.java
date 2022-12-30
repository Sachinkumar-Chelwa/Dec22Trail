package methods;
import com.java.method5.Nonstaticmethod;
public class Sameclass1 {
public void Sameclass1nonstaticmethod() {
	System.out.println("same class method is non static");
}
public static void main(String[] args) {
	Sameclass1 object= new Sameclass1();
	object.Sameclass1nonstaticmethod();
	Diffclass2 object1= new Diffclass2();
	object1.Diffclass2nonstaticmethod();
	Nonstaticmethod object2= new Nonstaticmethod();
	object2.Diffpackagenonstaticmethod();
}
}
