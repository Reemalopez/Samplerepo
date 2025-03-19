package abstraction;

public class Abstractchild extends Abstractparent{
	
	
	

	

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("this is an abstract method");
		
	}
	
	public void print2()
	{
		System.out.println("child class second method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Abstractchild c1=new Abstractchild();// when both parent and child class objects need to be accessed
	c1.display();
		c1.print();
	c1.print2();*/
		Abstractparent A1 = new Abstractchild();// reference creation for the parent class (when only parent methods need to be accessed)
		A1.display();
		A1.print();
		
	}

}
