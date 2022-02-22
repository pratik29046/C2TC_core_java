package escan;
class bike{
	void run() {
		System.out.println("bike run");
	}
}
class car extends bike{
	void run() {
	System.out.println("car run");
	}

}

public class Polydemo {

	public static void main(String[] args) {
		bike obj=new car();
		obj.run();
		

	}
	

}
