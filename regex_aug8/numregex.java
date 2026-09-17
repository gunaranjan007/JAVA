import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class numregex
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String rollno;
		
		//Pattern regno=Pattern.compile("^([0-5]{3})");// ^ represents  begins with
		Pattern regno=Pattern.compile("([0-9]{3})5$");// $ represents  ends with that particular number or character
	
		
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter your Register number :");
			rollno=input.nextLine();
			
			Matcher m=regno.matcher(rollno);
			if(m.matches())
			  System.out.println("Valid Register Number");
		    else 
				System.out.println("Invalid Register Number");
		}
	}//psvm Ends 
}//class Ends 