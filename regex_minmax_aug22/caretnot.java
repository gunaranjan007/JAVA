import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class caretnot
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String number;
	   //Pattern ch_pattern=Pattern.compile("[a-g&&[^ce]]");   // Caret Not
	   Pattern ch_pattern=Pattern.compile("[a-m&&[d-g]]");   // Caret Not
  
		for(int i=0;i<4;i++)
		{
			System.out.print("Enter your word:");
			number=input.nextLine();
		 
			Matcher m=ch_pattern.matcher(number);
			
			if(m.matches()  )
			  System.out.println("Valid character");
			else
				System.out.println("Invalid Number");
		}
	
	}//psvm Ends 
}//class Ends 