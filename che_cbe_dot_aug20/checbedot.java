import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class checbedot
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String number;
	   Pattern chennai_pattern=Pattern.compile("(044)([0-9]{8})");  
	   Pattern coimbatore_pattern=Pattern.compile("(0422)([0-9]{7})");
	   
		for(int i=0;i<2;i++)
		{
			
			System.out.print("Enter your Number:");
			number=input.nextLine();
		 
			Matcher m=chennai_pattern.matcher(number);
			Matcher n=coimbatore_pattern.matcher(number);
			
			
			if(m.matches() )
			  System.out.println("Chennai's  number");
		    else if(n.matches())
				System.out.println("Coimbatore's Number");
			else 
				System.out.println("Invalid number Number");
			
		}
	
	}//psvm Ends 
}//class Ends 