import 	Stat.*;
import java.util.Scanner;
class Calculationavg
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		int num1=0,num2=0,num3=0;
		System.out.print("Enter Number 1:");
		num1=input.nextInt();
		System.out.print("Enter Number 2:");
		num2=input.nextInt();
		System.out.print("Enter Number 3:");
		num3=input.nextInt();
		
		double avg3=average.averageCal(num1,num2,num3);
		double avg2=average.averageCal(num1,num2); 
		
		System.out.print("The average is"+avg3);
		System.out.print("The average is"+avg2);	
		
	}//psvm ends
}//class Calculationavg Ends