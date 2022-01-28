package hello;
import java.util.Scanner;


public class Switch_Case {

	public static void main(String[] args) {
		int i;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your choice :- ");
		i=input.nextInt();
	      
        
        switch(i){
        
        case 97:
        	System.out.println(10);
        	
        	
        case 98:
        
        	System.out.println(1000);
        	break;
        
        
        	
        	
        case 99:
        	System.out.println(200000);
        	break;
        	
        
        default:
        	System.out.println("Default value..............");

	}

}
}

