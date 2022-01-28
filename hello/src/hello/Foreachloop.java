package hello;

public class Foreachloop {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		
		String fruits[]= {"apple","mango","banana","orange"};
		
		int count=0;
		
		for(String i:fruits) {
			System.out.println("The index " +count+ " value is :- " +i);
			count++;
		}
		

	}

}
