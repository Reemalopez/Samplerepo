package assignment8;

public class Salaryslip extends Hra {
	
	double tsal;

	public void totalsalary()
	{
		tsal=super.basicpay+super.hracalc-super.pfcalc-super.deduction+super.bonus;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salaryslip s1=new Salaryslip();
		s1.getdetails();
		s1.hracalc();
		s1.totalsalary();
		System.out.println("Please find your salary slip");
		System.out.println("Basic pay = "+ s1.basicpay);
		System.out.println("Deductions = "+ s1.deduction);
		System.out.println("HRA = "+ s1.hracalc);
		System.out.println("PF = "+ s1.pfcalc);
		System.out.println("Bonus = "+ s1.bonus);
		System.out.println("Total Salary = "+ s1.tsal);

	}

}
