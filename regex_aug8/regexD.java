import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class regexD
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String rollno;
		//Pattern regno=Pattern.compile("\\D{12}");(D can any non-digit can contain special characters)(d only  for )
		
		//Pattern regno=Pattern.compile("\\w{6}");//(w can any digit and alpha)({} is for Range )
		
		Pattern regno=Pattern.compile(".{6}");//(dot  can any thing in the keyboard (wild card) )
		
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