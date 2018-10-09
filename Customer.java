import java.util.*;
class Customer
{
    public static String bankName="MiniBank";
	public String name;
	public double balance;
	Customer(String name)
	{
		this.name=name;		
	}
	public void deposit(double amount)
	{
		this.balance=this.balance+amount;
		System.out.println("Balance is:"+this.balance);
	}
	public void withdraw(double amount)
	{
		if(amount>balance)
		{
			System.out.println("Sorry..Insufficient Funds..Cannot perform this operation");
			System.exit(0);
		}
		else
		{
			balance=balance-amount;
			System.out.println("Balance :"+balance);
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome to MiniBank "+Customer.bankName);
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name=sc.next();
		Customer c1= new Customer(name);
		System.out.println("Hello "+c1.name+" Account created successfully.");
		while(true)
		{
			System.out.println("Select Operation:");
			System.out.println("D-Deposit\nW-WithDraw \nE-Exit");
			String option=sc.next();
			if (option.equalsIgnoreCase("D"))
			{
				System.out.println("Enter Amount:");
				double amount=sc.nextDouble();
				c1.deposit(amount);
			}
			else if(option.equalsIgnoreCase("W"))
			{
				System.out.println("Enter amount to Withdraw:");
				double amount=sc.nextDouble();
				c1.withdraw(amount);
			}
			else if(option.equalsIgnoreCase("E"))
			{
				System.out.println("Thanks for Banking with us!");
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid option..Plz choose valid option");
			}
		}		
	}
}
