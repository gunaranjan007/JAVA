import java.util.Scanner;
class Indianmoney
{
	private int rupee,anna,paisa;
	Indianmoney(int rupee,int anna,int paisa)//constructor class 
	{
		this.rupee=rupee;
		this.anna=anna;
		this.paisa=paisa;
	}
	public void Calculatetotal()//central to survey everything 
	{
		int totalpaisa=0;
		for(int i=0;i<2;i++)
		{
		   totalpaisa+=paisaconversion(rupee,anna,paisa);
		}
		addition(totalpaisa);
		
	}
    private int paisaconversion(int drupee,int danna,int dpaisa)
	{
		int paisamoney=0;
		paisamoney=(drupee*(12*16)+danna*12+dpaisa);//245//341
     return(paisamoney);
	}
	private  void  addition(int addedmoney)
	{
		int  totalrupee=(int)(addedmoney/(12*16)); //410/192=2.(something)
		int remainingmoney=addedmoney-(totalrupee*192);//410-2*192=26
		int totalanna=(int)(remainingmoney /12);//26/2=2
		int totalpaisa=addedmoney-(totalrupee*192)-(totalanna*12);//410-192*2-2*12=2 
		System.out.print("THE MONEY ARE "+totalrupee+ " Rupees" +totalanna+ " Anna "+totalpaisa+" Paisa");
		 
	}
}//class ends

public class addrupee
{
	public static void main(String args[])
    {
		Indianmoney piggy1=new Indianmoney(42,93,2);
		Indianmoney piggy2=new Indianmoney(52,91,4);
		static int addition(Indianmoney piggy1,Indianmoney piggy2)
		{
			int totalmoney=0;
			int paisa1
			totalmoney=Indianmoney.piggy1+Indianmoney.piggy2;
			addition(totalmoney);
		}
		
		piggy1.Calculatetotal();
		piggy2.Calculatetotal();
		
	}
}//class public ends
		