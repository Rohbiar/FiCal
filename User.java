public class User {

	private String name;
	private int accNum;
	private String bankName;
	private double bal;
	private static int numUsers;
	
	public User() {
		
	}
	
	public User(String name, int accNum, String bankName, double bal) {
		
		this.name = name;
		this.accNum = accNum;
		this.bankName = bankName;
		this.bal = bal;
		numUsers++;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public void setBal(double bal) {
		this.bal = bal;
	}
	
	public String getName() {
		 return name;
	}
	 
	public double bal() {
	     return bal;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public int getNumUser() {
		return numUsers;
	}
	
	public int getAccNum()
	{
		return accNum;
	}
	
	public void deposit(double add) {
		bal += add;
		System.out.println("Your new balance is: " + bal);
	}
	
	public void withdraw(double subtract) {
		bal -= subtract;
		System.out.println("Your new balance is: " + bal);
	}
	
	public void isInvest(double investmentPrinciple) {
		System.out.println(investmentPrinciple + " has been moved for investments");
		bal = bal - investmentPrinciple;
	}
	
	
	
}
