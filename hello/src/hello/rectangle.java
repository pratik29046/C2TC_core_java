package hello;

import java.util.Scanner;
public class rectangle {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter your length:- ");
		double length=input.nextDouble();
		
		System.out.println("Enter your width:- ");
		double width = input.nextDouble();
		
	
		double area = length*width;
		System.out.println("The area of rectangle is:  " +area);

	}

}
