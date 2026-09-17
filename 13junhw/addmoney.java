import java.util.Scanner;
class Money
{
	public int dollar=0,dime=0,cents=0;
	
	Money(int dollar,int dime,int cents)//constructor 
	{
		this.dollar=dollar;
		this.dime=dime;
		this.cents=cents;	
	}
	public void central()//central to survey everything 
	{
		int totalinch=0;
		for(int i=0;i<2;i++)
		{
		   totalinch+=centconversion(dollar,dime,cents);
		}
		addition(totalinch);
		
	}
	public  int  centconversion(int ddollar,int ddime,int dcent)
	{
		int money=0;
		money=(ddollar*100+ddime*10+dcent);	
      return(money);
    }

	private  void  addition(int addedmoney)
	{
		 int cents=addedmoney%10;
		int dime=((addedmoney-cents)%100)/10;
		 int dollar=addedmoney/100;
		System.out.print("THE MONEY ARE "+dollar+ " " +dime+ " "+cents);
	}
}//class money ends
public class addmoney
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.print("Enter how Many Piggy Bank do you Have:");
		int num=input.nextInt();
		Money p1=new Money(1,1,1);
		System.out.println();
		Money p2=new Money(2,3,4);
		
	}
}
		
	
		