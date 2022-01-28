package hello;

class Mythread implements Runnable{
	
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println("chlid class");
		}
	}
	
}

public class Threads {

	public static void main(String[] args) {
		Mythread m=new Mythread();
		Thread t=new Thread(m);
		t.start();
		
		
		for(int i=0;i<5;i++) {
			System.out.println("this is main");
			
		}
		

	}

}
