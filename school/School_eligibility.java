import 	Class.*;
import java.util.Scanner;
class School_eligibility
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		int age=0,mark=0;
		char gender;
		
		
		System.out.print("Enter Gender:");
		gender=input.nextLine().charAt(0);
		System.out.print("Enter Age :");
		age=input.nextInt();
		System.out.print("Enter MARK :");
		mark=input.nextInt();
		
		
		String status=Admission.markEligible(mark);
		String result=Admission.ageEligible(age);
		
	  
		
		System.out.print("you mark is "+status);
		System.out.print("you age is "+result);	
		
	}//psvm ends
}//class Calculationavg Ends