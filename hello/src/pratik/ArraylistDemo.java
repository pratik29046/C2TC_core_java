package pratik;

import java.util.*;
public class ArraylistDemo {

	public static void main(String[] args) {
		ArrayList  a=new ArrayList();
		a.add("p");
		System.out.println(a);
		
		a.add(null);
		a.add("p");
		a.add(5);
		a.add(54.55);
		System.out.println(a);
		
		
		a.remove(0);
		a.add(0,"pratik");
		
		System.out.println(a);
		
		
		

	}

}
