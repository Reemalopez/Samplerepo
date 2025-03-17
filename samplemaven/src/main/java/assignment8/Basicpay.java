package assignment8;

import java.util.Scanner;

public class Basicpay {
	int basicpay;
	int deduction;
	int bonus;
	
	public void getdetails()
	{
		Scanner inputvalue =new Scanner(System.in);
		System.out.println("Enter the basic pay");
		basicpay=inputvalue.nextInt();
		Scanner inputvalue2 =new Scanner(System.in);
		System.out.println("Enter the deductions");
		deduction=inputvalue2.nextInt();
		Scanner inputvalue3 =new Scanner(System.in);
		System.out.println("Enter the bonus ");
		bonus=inputvalue3.nextInt();
	}
	
	
	
	
}
