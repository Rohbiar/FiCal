import java.util.*;
//import EasyXLS.*;
public class Business extends User{
	
	private double cashOnHand;
	private double liaVal;
	private double assetsVal;
	
	
	
	public Business(String name, int accNum, String bankName, double bal, double cashOnHand, double liaVal, double assetsVal) {
		
		super();
		this.cashOnHand = cashOnHand;
		this.assetsVal = assetsVal;
		this.liaVal = liaVal;
	}
	
	public double getCashOnHand() 
	{
		return cashOnHand;
	}
	
	public double getliaVal()
	{
		return liaVal;
	}
	
	public double getassetsVal()
	{
		return assetsVal;
	}
	
	public void setCashOnHand(double g){
		
		cashOnHand = g;
	}
	
	public void setLiaVal(double l)
	{
		liaVal = l;
	}
	
	public void setAssetsVal(double s)
	{
		assetsVal = s;
	}
	
	public void assetsMinusLia()
	{
		System.out.println(assetsVal - liaVal);
	}
	
	public void lowInfoBalsheet()
	{
		double[][] lowInfo = new double[4][1];
		lowInfo[0][0] = assetsVal;
		lowInfo[1][0] = liaVal;
		lowInfo[2][0] = cashOnHand;
		lowInfo[3][0] = (assetsVal - liaVal + cashOnHand);
		
		System.out.println("Low Info balance sheet: ");
		
		for(int i = 0; i <= 4; i++)
		{
			if (i == 0)
			{
				System.out.print(lowInfo[i][0]);
				System.out.println(" The Value of Assets");
			}
			if (i == 1)
			{
				System.out.print(lowInfo[i][0]);
				System.out.println(" The Value of Liabilities");
			}
			if (i == 2)
			{
				System.out.print(lowInfo[i][0]);
				System.out.println(" The Value of Cash on Hand");
			}
			if (i == 3)
			{
				System.out.print(lowInfo[i][0]);
				System.out.println(" Remaining Balance");
			}

		}
		
		
	}
	
	
}
