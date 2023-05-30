
public class Account1 {
	private String name;
	private int balance;
	private int min_bal=1000;
	
	public void setAttr(String n, int k)
	{
		name= n;
		balance=k;
	}
	public String getName()
	{
		return name;
		
	}
	public int getBalance()
	{
		return balance;
		
	}
	
	public void withdraw(int k)
	{
		if(balance<min_bal)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			if(k>balance)
			{
				System.out.println("Withdraw amount is more");
			}
			else
			{
				balance=balance-k;
				System.out.println(balance);
			}
		}
	}
	public void deposit(int k)
	{
		balance=balance+k;
	}
	

}
