package pratik;
 class student {
	static String universityname="Mumbai Univarsity";
	String name;
	int id;
	
	void info(String name,int id) {
		System.out.println("The univarsity name is "+universityname +" student name is "+ name +", and id number is "+id );
		
	}
	
}
public class Packageclass {

	public static void main(String[] args) {
		
		student obj=new student();
		obj.info("pratik", 52552);
		

	}

}
