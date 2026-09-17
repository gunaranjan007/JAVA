import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class stringPattern
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String rollno;
		int lenof_name=0;
		
		System.out.print("Enter your Register number:");
		rollno=input.nextLine();
		
		//Pattern regno=Pattern.compile("\\d{12}");//Intialize the pattern and compile it once which is final(back slash\\)
		
		
		//Pattern regno=Pattern.compile("[1-6]{4}");//Intialize the pattern and compile it once which is final(back slash\\)(4 is count)
		
		//Pattern regno=Pattern.compile("[a-d]([1-6]{3})");	
		
		
		//Pattern regno=Pattern.compile("[a-d]-([1-6]{3})");//it is case Sensitive 
		
		Pattern regno=Pattern.compile("[(a-dA-D)]{2}-([1-6]{3})");//it is case Sensitive 
		
		
		Matcher m=regno.matcher(rollno);
		
		if (m.matches())
		  System.out.print("Valid register Number");
	    else 
			System.out.print("Invalid Register number");
		
	/**
		if(lenof_name==0)
			System.out.print("must contain character");
		else if (lenof_name>=12)
			System.out.print("Valid Name");
		else 
			System.out.print("Invalid"); **/
		
		
	}//psvm Ends 
}//class ends 