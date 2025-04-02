package OOP.src.Interface_;

interface Bank
{
	void deposit(double amount);
	void withdraw(double amount);
}

class Customer implements Bank
{
	private double balance = 10000;

	@Override
	public void deposit(double amount) 
	{
		if(amount <=0)
		{
			System.out.println("Deposit is not possible");
			System.exit(0);
		}
		this.balance = this.balance + amount;
		System.out.println("Amount after deposit :"+this.balance);
	}

	@Override
	public void withdraw(double amount) 
	{
	   if(amount > this.balance)
	   {
		   System.out.println("Withdraw is not possible");
		   System.exit(0);
	   }
	   this.balance = this.balance - amount;
	   System.out.println("Amount after withdraw is :"+this.balance);
	}
}
public class InterfaceDemo3 
{
	public static void main(String[] args)
	{
        Bank bank = new Customer();	
        bank.deposit(12000);
        bank.withdraw(50000);
	}

}