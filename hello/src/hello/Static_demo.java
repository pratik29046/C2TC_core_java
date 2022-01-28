package hello;

class st{
	
	int roll;
	String name;
	static String college_name="mumbai university";
	static String dept="computer";

	
	static void change() {
		 college_name="V O G C O E";
	  }
	
	
	
  st(int r,String n) {
		roll=r;
		name=n;
	}
	
  
   void display() {
	   System.out.println ("the name is " +name +" roll number is "+roll +" college name is " +college_name +" and branch "+dept );
   }
   
 
	
	
}


public class Static_demo {

	public static void main(String[] args) {
		st.change();
		
		st s1=new st(10,"pratik");
		st s2=new st(100,"pratik");
		s1.display();
		s2.display();
			
		

	}

}
