package encapsulation;

public class Encapsulationparent {
	
	String name; 
	int rollno;
	public void setter(String name,int rollno)
	{
		
		this.name=name;
		this.rollno=rollno;
	}
	public void getter()
	{
		
		System.out.println(rollno + name);
	}
	
	
}
