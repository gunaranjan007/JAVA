package Stat;
public class average
{
	public static double averageCal(int m1,int m2)//overloading method with 2 parameter 
	{
		double avg=0.0f;
		avg=(m1+m2)/2;
		
	return(avg);
	}
	public static double averageCal(int m1,int m2,int m3)//overloading method with 3 parameters
	{
		double avg=0.0f;
		avg=(m1+m2+m3)/3;
	return(avg);        //Return type double 
	}
}
