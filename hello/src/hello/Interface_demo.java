package hello;
interface A{
	void Adisplay();
}
interface B{
	void Bdisplay();
}


class colleges implements A,B{
	public void Adisplay() {
		System.out.println("i am A");
	}
	public void Bdisplay() {
		System.out.println("i am B");
	}
}

public class Interface_demo {

	public static void main(String[] args) {
		colleges c=new colleges();
		c.Adisplay();
		c.Bdisplay();
	

	}

}
