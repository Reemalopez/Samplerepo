package inheritance;

public class HeirarchialChildB extends HeirarchialParent {

	public void display2()
	{
		System.out.println("This is the child 2");
	}
	public static void main(String[] args) {
		
		HeirarchialChildB B1=new HeirarchialChildB();
		B1.display();
		B1.display2();
	}

}
