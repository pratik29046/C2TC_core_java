package pratik;
import java.util.Scanner;
public class Righttriangle_pattern {
	public void righttriangle(int n) {
		int i,j;
		for(i=0;i<n;i++) {
			System.out.println(" ");
		
		
		for(j=0;j<=i;j++) {
			System.out.println("* ");
		}
	}
		
		System.out.println();
		
}

	public static void main(String[] args) {
		int n;
		
		
		Scanner values = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		n=values.nextInt();
		
		Righttriangle_pattern obj=new Righttriangle_pattern();
		obj.righttriangle(n);
		

	}

}
