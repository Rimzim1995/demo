package monu;

public class localinnerclass {

	int x=10;
	void msg() {
		
		class inner{
		
			void  msg1() {
				System.out.println(x);
			}
			localinnerclass b=new localinnerclass();
             
		}
		
	}
	
	public static void main(String[] args) {
		
	}
}
