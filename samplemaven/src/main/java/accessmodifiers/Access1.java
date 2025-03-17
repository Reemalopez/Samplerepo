package accessmodifiers;

public class Access1 {

	public void print()
	{ System.out.println("Public");
		}
	private void print1()
	{
		
		 System.out.println("Private");
	}
	protected void print2()
	{
		
		 System.out.println("protected");
		 
	}
	void print3()
	{
		
		 System.out.println("default");
		 
	}
	
	
	public static void main(String[] args) {
		
		Access1 A1 =new Access1();
		A1.print();
		A1.print1();
		A1.print2();
		A1.print3();

	}

}
