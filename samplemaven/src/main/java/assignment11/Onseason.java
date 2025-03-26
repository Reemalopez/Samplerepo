package assignment11;

public class Onseason {
	double price;
	public void setdiscount(double price)
	{
		this.price=price;
		double newprice=0.85*price;
		System.out.println("Discounted price is "+newprice );
	}
}
