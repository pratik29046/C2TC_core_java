package pratik;



public class UserdefPack {
	int a,b,c;
	
	public void add(int a,int b) {
		c=a + b;
		System.out.println(c);
		
	}
	public void sub(int a,int b) {
		c=a - b;
		System.out.println(c);
		
	}
	
	

	public static void main(String[] args) {
		UserdefPack obj= new UserdefPack();
		obj.add(500, 100);
		
	}

}
