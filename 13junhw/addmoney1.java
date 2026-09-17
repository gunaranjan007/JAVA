import java.util.Scanner;
class Money
{
	public int money=0;
	private int dollar,dime,cents;
	Money(int dollar,int dime,int cents)//Constructor class 
	{
		this.dollar=dollar;
		this.dime=dime;
		this.cents=cents;
		money=centconversion(dollar,dime,cents);
	}
    private int centconversion(int ddollar,int ddime,int dcents)
	{
		int centmoney=0;
		centmoney=(ddollar*100+ddime*10+dcents);	//245 //341
     return(centmoney);
	}
}//class ends

public class addmoney1
{
	public static void main(String args[])
    {
		Money p1=new Money(7,9,9);
		Money p2=new Money(3,9,7);
		int addedmoney=p1.money+p2.money;//245+341=586
		int dcents=addedmoney%10;//6
		int ddime=((addedmoney-dcents)%100 )/10;//586-6%100/10=8
		int  ddollar=addedmoney/100;//586/100=5
		System.out.print("THE MONEY ARE "+ddollar+ " " +ddime+ " "+dcents);

	}
}//class public ends