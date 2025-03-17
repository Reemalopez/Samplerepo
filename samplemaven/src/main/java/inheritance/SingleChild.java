package inheritance;

public class SingleChild extends SingleParent {

	public void display1(){
		
		System.out.println("This is a child class");
	}
	public static void main(String[] args) {

		SingleChild S1=new SingleChild();
		S1.display();
		S1.display1();

	}

}
