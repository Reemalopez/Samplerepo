package interfacepackage;

public class Interface2 implements Interface1 {

	

	@Override
	public void display() {
		System.out.println("display");
		
	}

	@Override
	public void print2() {
		
		System.out.println("print2");
		
	}
	
	public static void main(String[] args) {
		
		Interface2 I1=new Interface2();
		I1.display();
		I1.print2();
		
	}

}
