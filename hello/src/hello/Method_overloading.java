package hello;

public class Method_overloading {
	
	public void m() {
		System.out.println("no parameters");
	}
	public void m(int a) {
		System.out.println(a);
	}
	public void m(double s) {
		System.out.println(s);
	}

	public void m(String p) {
		System.out.println("double");
	}
	public static void main(String[] args) {
		
		Method_overloading d=new Method_overloading();
		d.m(2L);
		d.m();
		d.m(2.55);
		d.m(5);
		d.m(8);
		d.m(85.5f);
		d.m("hello");

	}

}
