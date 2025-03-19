package abstraction;

public class Multiplechild implements MultipleparentA,MultipleparentB {

	

	@Override
	public void print() {
		System.out.println("print");
		
	}

	@Override
	public void display() {
		System.out.println("display");
		
	}

	@Override
	public void display2() {
		System.out.println("display2");
		
	}
	
	public static void main(String[] args) {
		Multiplechild c1=new Multiplechild();
		c1.display();
		c1.display2();
		c1.print();

	}

}
