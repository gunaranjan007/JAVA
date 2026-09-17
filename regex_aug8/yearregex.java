import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class yearregex
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String year;
		
		Pattern yy=Pattern.compile("^200[4-6]$");// ^ represents  starts with that particular number or character && $ represents ends with
		
			System.out.print("Enter your year :");
			year=input.nextLine();
			
			Matcher m=yy.matcher(year);
			if(m.matches())
			  System.out.println("Valid year");
		    else 
				System.out.println("Invalid year");
		
	}//psvm Ends 
}//class Ends 