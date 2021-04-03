package monu;

public class commandlinearguments {

	public static void main(String[] args) {
		int length=args.length;
		if(length==0)
		{
		System.out.println("No inputs provided");	
		}
		else
		{
			System.out.println("List of Arguments");	
			System.out.println(args[0]);	

			}
		
			
		}
			
	}

