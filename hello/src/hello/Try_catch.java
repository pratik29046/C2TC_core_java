package hello;

public class Try_catch {

	public static void main(String[] args) {
		System.out.println("HELLO");
		
		try {
			System.out.println(10/0);
			
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("exception show");
		}

	}

}
