import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class accnumber_asterisk
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String accnumber,updated_accnumber;
			System.out.print("Enter your Account Number:");
			accnumber=input.nextLine();
			
	
					updated_accnumber=accnumber.replaceAll("\\d","*");

			System.out.print("your account has been updated  registered:"+updated_accnumber);
			
			  
		
	
	}//psvm Ends 
}//class Ends 