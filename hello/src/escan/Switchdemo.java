package escan;
import java.util.Scanner;

class switch1{
	void Switchss(int a) {
		
		switch(a) {
		case 10:{
			System.out.println("this is 10");
			break;
		}
		
		case 20:{
			System.out.println("this is 20");
			break;
		}
		
		}
		
	}
}



public class Switchdemo {

	public static void main(String[] args) {
		
		switch1 s=new switch1();
		 Scanner input=new Scanner(System.in);
		 System.out.println("enter your value");
		 int a=input.nextInt();
		 s.Switchss(a);
		
	}

}
