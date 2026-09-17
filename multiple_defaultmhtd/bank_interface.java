interface customer
{
	abstract public void openaccount(String cusName,int adhaar);
	abstract public int deposit(int amount);
	abstract public int withdraw(int amount);
	abstract public int balance();
}//interfaces ends
class bank
{
	String cusName;
	int adhaar=0;
	bank(String cusName,int adhaar)
	{
		this.cusName=cusName;
		this.adhaar=adhaar;
	}
	public void account_opening(customer c)//object Incoming
	{
		c.openaccount(cusName,adhaar);
		System.out.println("Account opened");
	}
}
class customer_account implements customer
	String cusName;
	int amount=0,adhaar=0;//data members 
	int curr_amount, withdraw_money,balance;
	customer_account(String cusName,int adhaar,int amount)//constructor 
	{
		this.cusName=cusName;
		this.adhaar=adhaar;
		this.amount=amount;
	}
	@Override public void openaccount(String cusName,int adhaar)
	{
		System.out.print("Your account has been opened ");
		
	}
	@Override public int deposit(int amount)
	{
		curr_amount=balance+amount;
	return(curr_amount);
	}
	@Override public int balance()
	{
		balance=curr_amount;
	return(balance);
	}
	@Override public int withdraw(int amount)
	{

		if(amount<balance)
			 withdraw_money=curr_amount-amount;
	return(withdraw_money);
	}			
}
public class bank_interface
{
    public static void main(String args[])
    {
		bank bnk1=new bank("guna",2982);
		customer cus1=new customer_account("guna",2982,2000);
		bnk1.account_opening(cus1);
		System.out.println("The credited total money is "+cus1.deposit(2000));
		System.out.println("The Balance Amount is "+cus1.balance());
		System.out.println("The money which is debited balance "+cus1.withdraw(2000));
    }
}//class public ends 
	