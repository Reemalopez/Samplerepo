package assignment8;

public class Hra extends Basicpay {
	double hracalc;
	double pfcalc;
	
	public void hracalc()
	{
		//Hra hra1 =new Hra();
		
		int bpay=super.basicpay;
		hracalc = 0.05*bpay;
		pfcalc = 0.2*bpay;
		//System.out.println(hracalc);
		//System.out.println(pfcalc);
		
		
	}

}
