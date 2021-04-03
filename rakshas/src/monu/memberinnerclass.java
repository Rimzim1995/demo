package monu;

public class memberinnerclass {
	
	 int i=10;
 class inner1{
	public  void msg()
	{
//we can not define static method , variable inside anon static inner class
		i=40;
	System.out.println("Value of i: "+i);
	}

}

 public static void main(String[] args) {
	 memberinnerclass x =new memberinnerclass();
	 memberinnerclass.inner1 b=x.new inner1();
	 b.msg();
}
}
