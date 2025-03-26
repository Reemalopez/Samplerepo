package assignment10;

public class Address {
	
	String address;
	Student studentref1;
	
	public  Address(String address,Student studentref1)
	{
		this.address=address;
		this.studentref1=studentref1;
	}
	
	public void getdetails() {
			System.out.println(address+" is the address ");
			System.out.println(studentref1.name+" is the name ");
			System.out.println(studentref1.rollno+" is the rollno ");
			
		
	}
	
	

	public static void main(String[] args) {
		Student obj1=new Student("Jane",12);
		Address a1=new Address("TVM 1",obj1);
		a1.getdetails();

	}

}
