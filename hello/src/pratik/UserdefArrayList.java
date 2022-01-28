package pratik;
import java.util.*;


class Student2{
	int rollnu;
	String name;
	String branch;
	
	Student2(int rollnu,String name,String branch) {
		this.rollnu=rollnu;
		this.name=name;
		this.branch=branch;
		
		
	}
}

public class UserdefArrayList {

	public static void main(String[] args) {
		
		Student2 S1=new Student2(22,"pratik","comp");
		Student2 S2=new Student2(18,"rohit","mech");
		Student2 S3=new Student2(40,"harshal","civil");
		
		ArrayList <Student2> li=new ArrayList();
		li.add(S1);
		li.add(S2);
		li.add(S3);
		
	    Iterator itr=li.iterator();
	    
	    while(itr.hasNext()){  
	        Student2 st=(Student2)itr.next();  
	        System.out.println(st.rollnu+" "+st.name+" "+st.branch);  
		
	    }
		
		

	}

}
