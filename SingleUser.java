import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;  
import javax.swing.JOptionPane;
import java.time.LocalDateTime;   
public class SingleUser extends User{

	private double monthlyExpense;
	private String objective; //objective is based around user budget goals
	private boolean isReached; //refrences whether objective has been accomplished or not
	private String plan; //devises plan based on objective
	private ArrayList<String> otherExpenses;
	private ArrayList<Double> otherExpenditure;
	private ArrayList<String> categoryExpenditures;
	private double salary;
	private double passiveIncome;
	private double totalAssets;
	private double totalLiabilities;
	private String daysTillCycle;
	private int creditScore;
	Scanner scan = new Scanner(System.in);
	
	public SingleUser(String name, int accNum, String bankName, double bal, double monthlyExpense, int creditScore) {
		super();
		this.monthlyExpense = monthlyExpense;
		this.creditScore = creditScore;
	}
	
	//Commented as it is experimental and not yet fully user tested
	/*public void fillExpense() {
		
		
		System.out.println("How many of your expenses do not fall into a prior category?");
		int expenseCount = scan.nextInt();
		for (int i = 0; i <= expenseCount; i++)
		{
			System.out.println("What label would you like to give this monthly expense?");
			String expense = scan.next();
			otherExpenses.add(expense);
			System.out.println("What is the value of the expense?");
			otherExpenditure.add(scan.nextDouble());
		}
	}*/
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	
	public void setObjective(String s)
	{
		objective = s;
	}
	
	public void setPassiveIncome(double p)
	{
		passiveIncome = p;
	}
	
	public void budget()
    {
        System.out.println ("What is your income?");
        salary = scan.nextDouble();
        System.out.println ("Do you have passive income? If not, enter 0. If yes, enter in the value");
        passiveIncome = scan.nextDouble();
        System.out.println ("How much are your Housing Expenses (i.e. Mortgage, Rent, Utilities, House Insurance, etc.)?");
        double housingExp = scan.nextDouble();
        System.out.println ("How much are your Transportation Expenses (i.e. Car Insurance, Payment, Repairs, Gas, Fuel, etc.)?");
        double transportationExp = scan.nextDouble();
        System.out.println ("How much are your Educational Expenses (i.e. School Supplies, Student Loans, College Tuition, etc.)?");
        double educationalExp = scan.nextDouble();
        System.out.println ("How much are your Food and Personal Expenses (i.e. Groceries, Clothing, Entertainment, Medical, etc.)?");
        double personalExp = scan.nextDouble();

        double totalExp = housingExp + transportationExp + educationalExp + personalExp;
        double totalIncome = salary + passiveIncome;

        double remaining = totalIncome - totalExp;

        if (remaining < 0)
        {
        	System.out.println("Oh No! You are overdrafting your account charges!");
        }
        else
        {
        	System.out.println("You have " + remaining + " to spend this month!");
        }
        
        	
    }
	
	public void billTracker()
	{
		System.out.println("On what day of the month is the bill due? (DD Format)");
		daysTillCycle = scan.next();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();
		
		String dateNow = dtf.format(now);
		
		if (dateNow.substring(8,10).equals(daysTillCycle))
		{
			 if (JOptionPane.showInputDialog("YOUR BILL IS DUE TODAY PLEASE FULFILL THE REQUESTED AMOUNT: (y/n)").equals("n"))
			 {
				 System.out.println("Do not forget to pay the bill.");
			 }
		}
	}
	public void loanTool() {
		System.out.println("Welcome to the Loan Assist tool! \n Please choose from among the following loan types you would be interested in:");
		System.out.println();
		System.out.println("A. Home\nB. Auto\nC. Student\nD. Personal\nE. Credit Card\nF. Loan Shark loan\nG. Other");

		String loanType = scan.next().toLowerCase();
		System.out.println("How much is the principal of the loan? ");
		double principal = scan.nextDouble();
		System.out.println("Please indicate the interest rate on the loan (between 0 and 1): ");
		double interestRate = scan.nextDouble();
		System.out.println("How long, in years, will the loan last?");
		double years = scan.nextDouble();

		final double loanOwedTotal = (principal*interestRate*(Math.pow(1+interestRate, years*12)))/((Math.pow(1+interestRate,years*12))-1);


		if (loanType.equals("a")) {
			System.out.println("You can declare bankruptcy from this type of loan");
			System.out.println("You will owe: $" + loanOwedTotal + " in total.");


		}
		if (loanType.equals("b")) {
			System.out.println("You can declare bankruptcy from this type of loan");
			System.out.println("You will owe: $" + loanOwedTotal + " in total.");
			
		}
		if (loanType.equals("c")) {
			System.out.println("You cannot declare bankruptcy from this type of loan");
			System.out.println("You will owe: $" + loanOwedTotal + " in total.");
			
		}
		if (loanType.equals("d")) {
			System.out.println("You can declare bankruptcy from this type of loan");
			System.out.println("You will owe: $" + loanOwedTotal + " in total.");
			
		}
		if (loanType.equals("e")) {
			System.out.println("You can declare bankruptcy from this type of loan");
			System.out.println("You will owe: $" + loanOwedTotal + " in total.");
			
		}
		if (loanType.equals("f")) {
			System.out.println("You can technically declare bankruptcy from this type of loan, but a loan shark might break your kneecaps!");
			System.out.println("You will owe: $" + loanOwedTotal + " in total.");
			
		}
		if (loanType.equals("g")) {
			System.out.println("The bankruptcy status of this loan will depend on the specifics of the loan");
			System.out.println("You will owe: $" + loanOwedTotal + " in total.");
			
		}

	}
}
