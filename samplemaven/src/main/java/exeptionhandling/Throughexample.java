package exeptionhandling;

public class Throughexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age =17;
		if(age>18)
		{
			
			System.out.println("Age greater than 18");
		}
		
		else 
		{
			throw new ArithmeticException("age less than 18");
		}
	}

}
