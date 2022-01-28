package hello;


class Vehicles{  
	  
	  void run(){
		  System.out.println("Vehicle is running");
		  }  
	}  
	  
	class bikes extends Vehicles{  
	 
	  void run(){
		  System.out.println("Bike is running safely");
		  }  
	  }
	  
public class Method_hiding {

	public static void main(String[] args) {
		
		 bikes a = new bikes();
		 a.run();
		

	}

}
