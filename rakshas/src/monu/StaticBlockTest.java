---------------------package monu;

public class StaticBlockTest {
static int i=20;
	int d=9;

	 StaticBlockTest s;
	//=new StaticBlockTest();
	
	public static void main(String[] args) {
		
		/* s = new StaticBlockTest();
		System.out.println(s);
		
		System.out.println(s.d);
		
		StaticBlockTest t = new StaticBlockTest();
		System.out.println("ok");
		System.out.println(t.d);
		StaticBlockTest t1 = new StaticBlockTest();*/
		

		//outer.Inner a=new outer.Inner();
	//	a.showMsg();
		//outer.Inner.showMsg();
	}
	
	
	/*
	static{
		System.out.println(StaticBlockTest.i);
		System.out.println(s.d);
		s.d--;
		System.out.println(s);
	}
	*/
	
	
	public   void msg()
	{
	s=new StaticBlockTest();
		System.out.println(s);

		s=new StaticBlockTest();
		System.out.println(s);

	//		 s =new StaticBlockTest();
		// StaticBlockTest s =new StaticBlockTest();

		//System.out.println(s.d);

	}
	
	public static  void msg2()
	{
	//	 s =new StaticBlockTest();
		 s.msg();

	}
}
