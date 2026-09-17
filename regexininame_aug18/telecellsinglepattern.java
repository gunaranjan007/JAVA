import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class telecellsinglepattern
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String number;
		Pattern number_patt=Pattern.compile("[0-9]+");
		for(int i=0;i<2;i++)
		{
			
			System.out.print("Enter your Name with initial :");
			number=input.nextLine();
			
			int n=number.length();

			Matcher m=number_patt.matcher(number);
			
			if((m.matches()) && (n==10))
			  System.out.println("Cellular number");
		    else if((m.matches()) && (n==7))
				System.out.println("Department of Telicommunication Number");
			else 
				System.out.println("Invalid Number");
		}
	
	}//psvm Ends 
}//class Ends 