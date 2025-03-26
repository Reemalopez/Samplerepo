package assignment11;

import java.util.Scanner;

public class Offseason extends Onseason{
	
	double price;
	//double newprice;
	public void setdiscount(double price)
	{
		this.price=price;
		//this.newprice=newprice;
		double newprice=0.60 *price;
		System.out.println("Offseason Discounted price is "+newprice );
		
	}

	public void getdetails()
	{
		System.out.println("Enter season of Shopping");
		//Scanner numin =new Scanner(System.in);
		Scanner obj1=new Scanner(System.in);
		String season=obj1.next();
		System.out.println("Enter Price");
		Scanner obj2=new Scanner(System.in);
		price =obj2.nextDouble();
		season=season.toUpperCase();
		if(season.matches("ONSEASON"))
		{
			super.setdiscount(price);
			
		}
		else if(season.matches("OFFSEASON"))
		{
			this.setdiscount(price);
		}
		else
		{
			System.out.println("Enter correct season code");
		}
		
	}
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Offseason os1=new Offseason();
		os1.getdetails();
		

	}

}
