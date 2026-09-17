import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class Form
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String name,age,sex,stuid;
	   Pattern name_pattern=Pattern.compile("^(([A-Z]) )+([A-Z][a-z]+)"); //only character  //Initial and nAME 
	   Pattern age_pattern=Pattern.compile("([1-9][0-9])");      //only numbers
	   //Pattern sex_pattern=Pattern.compile("([M|F|O])");  //only character
	   Pattern sex_pattern=Pattern.compile("([Mm|Ff|Oo])");  //Also can be like this
	   Pattern stuid_pattern=Pattern.compile("^(26)(3116)(AA|BB|CC)([0-9]{3})");   //YEAR|CLGCODE|GRPCODE|STUREGNO
	   
		for(int i=0;i<4;i++)
		{
			System.out.print("Enter your Name:");
			name=input.nextLine();
			System.out.print("Enter your Age:");
			age=input.nextLine();
			System.out.print("Enter your Gender:");
			sex=input.nextLine();
			System.out.print("Enter your student Identity Number:");
			stuid=input.nextLine();
		 
			Matcher n=name_pattern.matcher(name);
			Matcher a=age_pattern.matcher(age);
			Matcher s=sex_pattern.matcher(sex);
			Matcher id=stuid_pattern.matcher(stuid);
			
			if(n.matches() && a.matches() && s.matches() && id.matches() )
			  System.out.println("Valid Form");
			else
				System.out.println("Invalid Form");
		}
	
	}//psvm Ends 
}//class Ends 