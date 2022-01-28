//package hello;
//import java.util.Scanner;
//
//class Laptop extends Exception{
//	 Laptop(String s){
//		super(s);
//		
//	}
//
//	
//	 
//}
//
//public class Userdefthrow {
//
//	public static void main(String[] args) throws Laptop  {
//		float price;
//		System.out.println("enter your price..... ");
//		Scanner s= new Scanner(System.in);
//		price=s.nextFloat();
//	
//		
//		if(price<=30000.00) {
//			throw new Laptop("the laptop is not available......");
//			
//		}
//		
//		else
//		{
//			 System.out.println("the laptop is a available......");
//		}
//	
//		
//
//	}
//
//}


package hello;
import java.util.Scanner;

class Laptop extends RuntimeException{
	 Laptop(String s){
		super(s);
		
	}

	
	 
}

public class Userdefthrow {

	public static void main(String[] args)   {
		float price;
		System.out.println("enter your price..... ");
		Scanner s= new Scanner(System.in);
		price=s.nextFloat();
	
		
		if(price<=30000.00) {
			throw new Laptop("the laptop is not available......");
			
		}
		
		else
		{
			 System.out.println("the laptop is a available......");
		}
	
		

	}

}
