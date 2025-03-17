package inheritance;

public class HeirarchialChildA extends HeirarchialParent {

	public void display1()
	{
		System.out.println("This is child A");
	}
	public static void main(String[] args) {
		
		HeirarchialChildA A1=new HeirarchialChildA();
		A1.display();
		A1.display1();
	}

}
