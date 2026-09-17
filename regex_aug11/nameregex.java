import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class nameregex
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String name;
		//Pattern stuname=Pattern.compile("[A-Z]\\s([A-Z]([a-z]{10}))"); input be M Gunaranajan
		//Pattern stuname=Pattern.compile("[A-Z] ([A-Z]([a-z]{10}))");
		Pattern stuname=Pattern.compile("[A-Z].([A-Z]([a-z]{10}))");
		
			System.out.print("Enter your Name with initial :");
			name=input.nextLine();
			
			Matcher m=stuname.matcher(name);
			if(m.matches())
			  System.out.println("Valid Name");
		    else 
				System.out.println("Invalid Name");
	
	}//psvm Ends 
}//class Ends 