package hello;

class A {
	double lenght=10;
	double width=10;
	double area;
	A(){
		area=lenght*width;
		System.out.println("The area of rectangle is: "+area);
			
	} 
	
	
}

class b{
	int n=2;
	b(){
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
//		A area=new A();
//		System.out.println(area);
		
		b evenodd =new b();
		System.out.println(evenodd);
	} 

} 
