package aggregation;

public class Aggregation1 {
	String name;
	int rollno;
	int age;
	public Aggregation1(String name,int rollno,int age) {
		
		this.name=name;
		this.age=age;
		this.rollno=rollno;
		
		// aggregation is used when you need to access the certain variables from parent to child (when all the data is not needed)
		
	}

}
