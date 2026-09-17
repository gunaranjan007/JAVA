import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class whitespace_regex
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String sentence;
		//Pattern sentence_pattern=Pattern.compile("^[A-Z]([A-Za-z]+)?(\\s[A-Za-z]+)+[.]$");
		Pattern sentence_pattern=Pattern.compile(\\b"keyboard"\\b);
		for(int i=0;i<2;i++)
		{
			System.out.print("Enter your Sentence :");
			sentence=input.nextLine();
			
			Matcher m=sentence_pattern.matcher(sentence);
			if(m.matches())
			  System.out.println("Valid sentence");
		    else 
				System.out.println("Invalid sentence");
		}
	
	}//psvm Ends 
}//class Ends 