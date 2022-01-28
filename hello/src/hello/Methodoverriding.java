package hello;

public class Methodoverriding {
	
	public static void main(String []args) {
		 Bike2 obj = new Bike2();  
		 obj.run();
		
		
	}

}
class Vehicle1{  
	   
	  void run(){
		  System.out.println("Vehicle is running");
	  }  
	}  
	  
class Bike2 extends Vehicle1{  
	  
	  void run(){
		  System.out.println("Bike is running safely");
	  }  
}
	  
	  