package polymorphism;

public class Polymorphismchild extends Polymorphismparent

{
	
public void display(int a, int b)
	
	{	int sum=a+b;
		
		System.out.println("Child sum " +sum);
		super.display(3, 3);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method overloading : same method name but different parameter list and arguments
		//method overriding :same method and same parameter list present in parent and child class.
		
		Polymorphismchild p1=new Polymorphismchild();
		p1.display(2, 3);
		
		
	}

}
