package Superkeyword;

public class Supervariablechild extends Supervariable {
	
	String color ="blue";
	public void display()
	{
		System.out.println(color);
		System.out.println(super.color);
		
	}

	public static void main(String[] args) {
		
		Supervariablechild s1=new Supervariablechild();
		s1.display();
	}

}
