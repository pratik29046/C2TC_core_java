package escan;

class demo2s{
//	static int a=10;
//	int bs;
//	int cs;
//	int d;
//	demo2s(int b,int c){
//		bs=b;
//		cs=c;
//		d=bs+cs+a;
//	}
//	void display() {
//	System.out.println(a+ "" +bs);
//	}
	
	static void dems() {
		System.out.println("hello i am static");
	}
	
	static {
		System.out.println("hellodddd");
	}
	
}

public class Staticdemos {

	public static void main(String[] args) {
//		demo2s obj=new demo2s(5,5);
//		obj.display();
		
		demo2s obj=new demo2s();
		obj.dems();
		
	}
	

}
