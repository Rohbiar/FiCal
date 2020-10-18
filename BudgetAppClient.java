import java.util.*;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;   
public class BudgetAppClient {

	public static void main (String[] args)
	{
		//Creating a scanner to feed primitve data information into program
		Scanner scan = new Scanner(System.in);
		
		//Parsing data into variables for single-user
		System.out.println("What is your name?");
		String name = scan.next();
		System.out.println("What is the account number?");
		int accNum = scan.nextInt();
		System.out.println("What is the bank name?");
		String bankName = scan.next();
		System.out.println("What is the balance of the account?");
		double bal = scan.nextDouble();
		System.out.println("What is your monthly balance?");
		double monthlyExpense = scan.nextDouble();
		System.out.println("What is your credit-score?");
		int cScore = scan.nextInt();
		
		//Creating a single user object named Palin
		SingleUser Palin = new SingleUser(name, accNum, bankName, bal, monthlyExpense, cScore);
		
		//Calling methods of the single-user class and spacing for output
		Palin.billTracker();
		System.out.println();
		Palin.budget();
		System.out.println();
		Palin.loanTool();
		System.out.println();
		
		//Parsing data into variables for Business objects
		System.out.println("What is the business name?");
		String nam =  scan.next();
		System.out.println("What is the account number?");
		int acNum = scan.nextInt();
		System.out.println("What is the bank name?");
		String bankCall = scan.next();
		System.out.println("What is the bank account balance?");
		double balance = scan.nextDouble();
		System.out.println("What is the cash on hand for the business?");
		double cashOnHand = scan.nextDouble();
		System.out.println("What is the value of all liabilities combined");
		double liabilities = scan.nextDouble();
		System.out.println("What is the value of all assets?");
		double assetVal = scan.nextDouble();
		
		
		//Creating a business object name Rohit
		Business Rohit = new Business(nam, acNum, bankCall, balance, cashOnHand, liabilities, assetVal);
		
		//calling methods of the business class
		
		Rohit.lowInfoBalsheet();
		Rohit.assetsMinusLia();
		
	}
}

