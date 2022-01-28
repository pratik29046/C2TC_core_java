package hello;

class Bikes1{  
	 int speedlimit=90;  
	} 

class Honda3 extends Bikes1{  
	 int speedlimit=150;  
	}
public class Polymorphism {

	public static void main(String [] args) {
		  Bikes1 obj=new Honda3();  
		  System.out.println( "The Speed limit is "+ obj.speedlimit);
		
	}
}
