package escan;
class Whiles{
	void whiles(int a) {
		int sum=0;
		
		while( a<20) {
			sum=sum+a;
			System.out.println("sum is a "+sum);
			a=a+1;
			
		}
	}
}
public class Whiledemo {
	public static void main(String[] args) {
		Whiles w = new Whiles();
		w.whiles(0);
		

	}

}
