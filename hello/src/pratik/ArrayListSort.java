package pratik;

import java.util.*;
public class ArrayListSort {

	public static void main(String[] args) {
		ArrayList <String> l1= new ArrayList <String>();
		
		
		l1.add("apple");
		l1.add("mango");
		l1.add("orange");
		l1.add("banana");
		l1.add(" ");
		
		Collections.sort(l1);
		for(String item:l1) {
			System.out.println(item);
		}

	}

}
