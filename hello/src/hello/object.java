package hello;

class A1{
	double lenght=10;
	double width=10;
	double area;
	A1(){
		area=lenght*width;
		System.out.println("The area of rectangle is: "+area);
			
	} 
	
	
}

class B{
	int n=2;
	B(){
		if(n%2==0) {
			System.out.println("number is even");   	
		} else
		{
			System.out.println("the value is odd");            
		}
	}
	
}

public class object {

	public static void main(String[] args) {
		A1 area=new A1();
		System.out.println(area);
		
		B evenodd =new B();
		System.out.println(evenodd);
	} 

} 
