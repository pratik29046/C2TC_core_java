package hello;
import java.util.Scanner;

public class While_do_while {

	public static void main(String[] args) {
		int a;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your value:- ");
		a=input.nextInt();
		int count=0;
//		do {
//			System.out.println("loop is running :- " +count +" times");
//			count++;
//			a++;
//			
//		}
//		while(a<=10);
		
		
		while(a<=10) {
			System.out.println("The while loop is running:- " +count+" times");
			count++;
			a++;
		}
		
		
		
		
		

	}

}
