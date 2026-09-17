import java.util.Scanner;
class 	Measurement
{
	public int inchmeasure=0;
	public int inch,feet,yard;
	Measurement(int inch,int feet,int yard)//constructor class 
	{
		this.inch=inch;
		this.feet=feet;
		this.yard=yard;
		Calculatetotal();
		
	}
	public void Calculatetotal()//central to survey everything 
	{
		int totalinch=0;
		for(int i=0;i<2;i++)
		{
		   totalinch+=inchconversion(inch,feet,yard);
		}
		addition(totalinch);
		
	}
    private int inchconversion(int dinch ,int  dfeet,int dyard)
	{
		int convertedinch=0;
		convertedinch=(dyard*(36)+(dfeet*12)+dinch);	
     return(convertedinch);
	}
	private  void  addition(int addedmeasurement)
	{
		int  totalyard=((int)addedmeasurement/36);//98=(2*36)+(2*12)+2
		int remainingmeasurement=addedmeasurement-(totalyard*36);//remainder of total
		int totalfeet =((int)(remainingmeasurement)/12);
		int totalinch=addedmeasure-(totalyard*36)-totalfeet*12;
		System.out.print("THE Total measure  ARE "+totalyard +" Feet " +totalfeet+ "inch " +totalinch); 
		 
	}
}//class ends

public class addmeasure
{
	public static void main(String args[])
    {
		Measurement place1=new Measurement(1,1,1);
		Measurement place2=new Measurement(1,1,9);
		
		

	}
}//class public ends
		