import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class cellnum_asterisk_pattern
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String accnumber;
		//Pattern accountnum_pattern=Pattern.compile("\\D{13}");
			System.out.print("Enter your Account Number:");
			accnumber=input.nextLine();
			
			//Matcher m=accountnum_pattern.matcher(accnumber);
//if(m.matches())
				StringBuilder accountno=new StringBuilder();  // create a string buffer (mutable)
				accountno.append(accnumber);
				
			for(int i=0;i<accnumber.length();i++)
			{
				if(accountno.charAt(i)>0)
					accountno.replace("\\d","*");
			}
				System.out.print("your account has been updated  registered:"+accountno);
			
			  
		
	
	}//psvm Ends 
}//class Ends 