package escan;

 abstract class demo{
	 abstract void run();
	 void call() {
		 System.out.println("hello");
	}
}

class ram extends demo{
	void run() {
		System.out.println("hello");
	}
	
}
class sham extends demo{
	void run() {
		System.out.println("hii");
	}
}

public class Abstractdemo {

	public static void main(String[] args) {
		demo obj=new ram();
		demo obj1=new sham();

		obj.run();
		obj1.run();
		obj1.call();
	

	}

}
