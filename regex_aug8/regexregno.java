import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class regexregno
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String rollno;
		//Pattern regno=Pattern.compile("([0-9]{2})(AA)(361)([0-9]{4})");
		
		Pattern regno=Pattern.compile("[0-9]{2}AA361[0-9]{4}");
		
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter your Register number :");
			rollno=input.nextLine();
			
			Matcher m=regno.matcher(rollno);
			if(m.matches())
			  System.out.println("Valid Register Number");
		    else 
				System.out.println("Invalid Register Number");
		}
	}//psvm Ends 
}//class Ends 