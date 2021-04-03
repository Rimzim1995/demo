package monu;

public class outer {

 int i = 30;
	
 public static void msg()
 {
	 System.out.println(" msg ");
 }
	static class Inner {
		public  void showMsg() {
		//	System.out.println("Value of i: "+i);// can not make asttic reference to a non - static field.
			msg();
			int j = 10;
			outer outer = new outer();
			outer.i=10;
			System.out.println(outer.i);
		}
	};
	
}
