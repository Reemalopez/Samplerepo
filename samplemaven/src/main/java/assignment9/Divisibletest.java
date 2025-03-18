package assignment9;

public class Divisibletest extends Divisible{
	
	public void divisiblitytest() {
	
		int sum1=super.sum(1, 5);

		
		if (sum1%10==0)
		{
			System.out.println("Divisible by 10");
		}
		else
			
		{
			System.out.println("Not Divisible by 10");
		}
		
	}

	public static void main(String[] args) {
		
		Divisibletest d1=new Divisibletest();
		d1.divisiblitytest();
		
		
	}

}
