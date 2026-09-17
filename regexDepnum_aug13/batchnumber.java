import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class batchnumber
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String regno;
		//Pattern stuname=Pattern.compile("24([A-C][A-C])([0-9]{3})");
		Pattern stuname=Pattern.compile("(24)(AA|BB|CC)(\\d{3})");
		
			System.out.print("Enter your Batch regno number :");
			regno=input.nextLine();
			
			Matcher m=stuname.matcher(regno);
			if(m.matches())
			  System.out.println("Valid Number");
		    else 
				System.out.println("Invalid Number");
	
	}//psvm Ends 
}//class Ends 