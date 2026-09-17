import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class plant_to_plan
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String sentence,updated_sentence;
			System.out.print("Enter your Sentence :");
			sentence=input.nextLine();
			
					//updated_sentence=sentence.replaceAll("\\bplan[a-z]+\\b","plan");
					
					updated_sentence=sentence.replaceAll("\\bplan[a-z]+","plan");// No need to specify (\\b) at the end Cuz we don't know the character after the plan

			System.out.print(updated_sentence);
			
			  
		
	
	}//psvm Ends 
}//class Ends 