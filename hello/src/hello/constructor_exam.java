package hello;

public class constructor_exam {
	
	String name;
	int roll,age;

	public constructor_exam(String name,int roll,int age) {
		this.name=name;
		this.roll=roll;
		this.age=age;
		
		
		
	}
	



		
	

	public static void main(String[] args) {
		constructor_exam  obj1= new constructor_exam("pratik",38,20);
		constructor_exam  obj2= new constructor_exam("rohan",38,20);
		System.out.println("name is "+obj1.name+" and age is " +obj1.age);
		System.out.println("name is "+obj2.name+" and age is " +obj2.age +" and roll number is "+obj2.roll);
		
		

	}

	
}

