import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class bloodgroupvalidation
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String blood_grp;
		Pattern grouppattern=Pattern.compile("(A|B|O|AB)([+|-])");
		for(int i=0;i<6;i++)
		{
			System.out.print("Enter your Blood Group :");
			blood_grp=input.nextLine();
			
			Matcher m=grouppattern.matcher(blood_grp);
			if(m.matches())
			  System.out.println("Valid Group");
		    else 
				System.out.println("Invalid Group");
		}
	
	}//psvm Ends 
}//class Ends 