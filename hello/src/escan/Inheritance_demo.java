package escan;
class Hello{
	void run() {
		System.out .println("hello");
	}
}

class Hi extends Hello{
	void run1() {
		System.out.println("hi");
	}
}

class By extends Hello{
	void by() {
		System.out.println("by");

	}
}
public class Inheritance_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hi obj=new Hi();
		By obj1=new By();
		obj.run1();
		obj.run();
		obj1.by();
		

	}

}
