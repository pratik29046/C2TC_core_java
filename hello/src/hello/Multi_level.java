package hello;
       
class Student{
	void college() {
		System.out.println("vishwatmak om gurudev college of engineering");
		
	}
}

class Roll extends Student{
	void rollnumber(int a) {
		System.out.println(a);
	}
}

class Branch extends Roll {                                        	
	void branch(String name) {
		System.out.println(name);
	}
}


public class Multi_level {

	public static void main(String[] args) {
		Branch s=new Branch();
		s.college();
		s.branch("computer");
		s.rollnumber(30);
		
	}

}

