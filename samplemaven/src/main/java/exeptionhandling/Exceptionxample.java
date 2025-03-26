package exeptionhandling;

public class Exceptionxample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a =10;
		int b =0;
		int c = 0;
		
		try {
		 c=a%b;
		}
		
		/*catch (ArithmeticException e)
		{
			System.out.println(e);
			b=1;
			c=a/b;
			System.out.println(c);
		
		}*/
		
		finally
		{
			
			b=1;
			c=a/b;
			System.out.println(c);
			System.out.println("Finally block");
		}
		
	}

}
