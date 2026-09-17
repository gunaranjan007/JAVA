import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class cellnum_asterisk
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String cellnumber;
		Pattern cellnum_pattern=Pattern.compile("\\d{10}");
			System.out.print("Enter your cell Number:");
			cellnumber=input.nextLine();
			
			Matcher m=cellnum_pattern.matcher(cellnumber);
			if(m.matches())
			{
				StringBuilder cellno=new StringBuilder();  // create a string buffer (mutable)
				cellno.append(cellnumber);
				
			/**	for(int i=0;i<cellno.length()/2;i++)
				{
					 cellno.setCharAt(i, '*');
				}
			**/
			cellno.replace(0,cellno.length()/2,"*****");
				System.out.print(cellno+" is been successfully registered");
			}
			  
		    else 
				System.out.println("Invalid Number");
	
	}//psvm Ends 
}//class Ends 