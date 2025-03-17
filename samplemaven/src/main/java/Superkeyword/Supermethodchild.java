package Superkeyword;

public class Supermethodchild extends Supermethodparent{
	public void display()
	{
		System.out.println("This is the child class");
		super.display();
	}

	public static void main(String[] args) {
		
		Supermethodchild c1=new Supermethodchild();
		c1.display();
	}

}
