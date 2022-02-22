package escan;

interface demo5{
	void hiss();
	void hi();
	
}

class Ras implements demo5{
	public void hiss() {
		System.out.println("hello");
	}
	public void hi() {
		System.out.println("come");
	}
}

public class Interdemo {

	public static void main(String[] args) {
		Ras obj=new Ras();
		obj.hiss();
		obj.hi();

	}

}
