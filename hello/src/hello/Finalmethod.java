package hello;

class Bike{  
	  final void run(){
		  System.out.println("running safely with 70kmph");
		  }  
	}  
	     
	class Honda extends Bike{  
	   void runs(){
		   System.out.println("running safely with 100kmph");
	   }  
	   
	}
	     
	   

public class Finalmethod {

	public static void main(String[] args) {
		Honda honda= new Honda();  
		honda.run();
		

	}

}
