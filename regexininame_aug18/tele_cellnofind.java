import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class tele_cellnofind
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String number;

		Pattern cellular_num=Pattern.compile("[0-9]{10}");// Valid 10 Numbers // Cellular Number Pattern
		Pattern dot_num=Pattern.compile("[0-9]{7}");//Valid 7 Numbers // Landline number Pattern
		for(int i=0;i<2;i++)
		{
			
			System.out.print("Enter your Name with initial :");
			number=input.nextLine();
			
			Matcher m=cellular_num.matcher(number);//Matcher for cell number
			Matcher n=dot_num.matcher(number);//Matcher for Landline Number
			
			if(m.matches())
			  System.out.println("Cellular number");
		    else if(n.matches())
				System.out.println("Department of Telicommunication Number");
			else 
				System.out.println("Invalid Number");
		}
	
	}//psvm Ends 
}//class Ends 