package escan;

class Breaks{
	 void breaks(int i) {
		 for(i=0;i<=10;i++) {
//			 System.out.println(i);
			 if(i==7) {
//				 break;
				 continue;
			 }
			 System.out.println(i);
		 }
	 }
	
}

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Breaks b=new Breaks();
		b.breaks(0);

	}

}
