package escan;


	

public class Threaddemos extends Thread {

	public static void main(String[] args) {
		Threaddemos obj=new Threaddemos();
		obj.start();
		for(int i=0;i<=5;i++) {
		try {
			Thread.sleep(10000);
			System.out.println("hello");
		}
		catch(Exception e) {
			System.out.println(e);
		}

		}
	}
	public void  run() {
		for(int i=0;i<=5;i++) {
		try {
		Thread.sleep(20000);
		System.out.println("i am run");
		
	}
		catch(Exception e) {
			System.out.println(e);
		}
		}
}
}

