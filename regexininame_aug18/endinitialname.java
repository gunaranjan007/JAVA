import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class endinitialname
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String name;

		Pattern stuname=Pattern.compile("(([A-Z])([a-z]+))( ([A-Z]))+");
		                                //Name             //Initial
		for(int i=0;i<2;i++)
		{
			
			System.out.print("Enter your Name with initial :");
			name=input.nextLine();
			
			Matcher m=stuname.matcher(name);
			if(m.matches())
			  System.out.println("Valid Name");
		    else 
				System.out.println("Invalid Name");
		}
	
	}//psvm Ends 
}//class Ends 