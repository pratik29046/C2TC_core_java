package hello;

class students{
	void college(String college_name) {
		System.out.println(college_name);
		
	}
}
class rolls extends students{
 public void rollnumbers(int a) {
		System.out.println(a);

				
	}
}

public class single_inheritance {

	public static void main(String[] args) {
		rolls a=new rolls();
		a.rollnumbers(5);
		a.college("vishwatmak om gurudev college of engineering");

	}

}
