package inheritance;

public class MultiLevelChild extends MultilevelParentB{
	public void display3()
	{
		System.out.println("This is the child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultiLevelChild M1=new MultiLevelChild();
		M1.display();
		M1.display2();
		M1.display3();
	}

}
