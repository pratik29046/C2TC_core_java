package escan;

 class demos{
	private String name;
	private int age;
	
	public String getnames() {
		return name;
	}
	public int getage() {
		return age;
	}
	
	public void setname(String getname) {
		name=getname;
	}
	
	public void setage(int getage) {
		age=getage;
	}
	
	
}

public class Encapdemo {

	public static void main(String[] args) {
		demos obj=new demos();
		obj.setname("pratik");
		obj.setage(25);
		
		System.out.println(" hiii"+obj.getnames()+ " 0"+ obj.getage());
		

	}

}
