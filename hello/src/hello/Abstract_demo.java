package hello;

public class Abstract_demo {

	public static void main(String[] args) {
		scooty s= new scooty();
//		s.noofwheels();
		s.m2();
		

	}

}

abstract class vehicle{
	 abstract void noofwheels();
	 abstract void m2();
	
}

abstract  class scooty extends vehicle{
	public void  noofwheels() {
		System.out.println(8);
		
	}

	
}