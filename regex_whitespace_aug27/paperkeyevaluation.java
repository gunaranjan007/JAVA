import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class paperkeyevaluation
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String sentence;
	        Pattern sentence1_pattern = Pattern.compile("([A-Za-z]*\\s)*(\\bkeyboard\\b)$");
            Pattern sentence2_pattern = Pattern.compile("^(\\bkeyboard\\b)(\\s[A-Za-z]*)*");
            Pattern sentence3_pattern = Pattern.compile("([A-Za-z]*\\s)(\\bkeyboard\\b)(\\s[A-Za-z]*)*");
            //Pattern sentence4_pattern = Pattern.compile("(\\bkeyboard\\b)");
			
			
			
			System.out.print("Enter your Sentence :");
			sentence=input.nextLine();
			
			Matcher s1=sentence1_pattern.matcher(sentence);
			Matcher s2=sentence2_pattern.matcher(sentence);
			Matcher s3=sentence3_pattern.matcher(sentence);
			//Matcher s4=sentence4_pattern.matcher(sentence);
			
			if(s1.matches() || s2.matches() || s3.matches() )
			  System.out.println("Correct Answer");
		    else 
				System.out.println("Incorrect Answer");
			
	}//psvm Ends 
}//class Ends 