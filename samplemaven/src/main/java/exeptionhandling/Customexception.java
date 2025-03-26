package exeptionhandling;

public class Customexception {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
		int age =17;
		if(age>18)
		{
			
			System.out.println("Age greater than 18");
		}
		
		else 
		{
			throw new VotingException("age less than 18");
		}

	}

}
