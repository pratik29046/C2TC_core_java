package hello;

public class DefaultEcxception {

	static void m() {
		m1();
	}

	static void m1() {
		System.out.println(10 / 0);
	}

	public static void main(String[] args) {
		m();
		System.out.println("Hello");
	}

}
