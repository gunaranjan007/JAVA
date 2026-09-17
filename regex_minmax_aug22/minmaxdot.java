import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class minmaxdot
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String number;
	   Pattern dot_pattern=Pattern.compile("([0-9]{7,})");  
	   
		for(int i=0;i<2;i++)
		{
			System.out.print("Enter your Number:");
			number=input.nextLine();
			
			int len=number.length();
		 
			Matcher m=dot_pattern.matcher(number);
			
			if(m.matches() && len==7 )
			  System.out.println("Coimbatore's DOT number");
		    else if(m.matches() && len==8)
				System.out.println("Chennai's DOT Number");
			else if (m.matches() && len==10)
				System.out.println(" Cell phone Number");
			else
				System.out.print("Invalid Number");
		}
	
	}//psvm Ends 
}//class Ends 