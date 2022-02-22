package escan;

class Fors{
	void fors(int n) {
		for(int i=0;i<n;i++) {
			System.out.println("the value of " +i);
		}
	}
}

public class Forloops {

	public static void main(String[] args) {
		Fors t=new Fors();
		int a[]= {10,20,30,40,50};
		for(int s=0;s<a.length;s++) {
			System.out.println(a[s]);
		}
		t.fors(5);

	}

}
