import java.util.Scanner;
import java.lang.Math;
class randomnumgame
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		
		String[] question=new String[5];
		 question[1]="hello here your question";
		
		int guessnumber=(int)(Math.random()*5+1);
		
		if(guessnumber==2)
		{
			System.out.println("you got it, The correct number is "+guessnumber);
			String winnerquestion=question[guessnumber-1];
			System.out.print(winnerquestion);
		
		}
		  
	    else
			System.out.print("Sorry try again ");
		
	}//psvm ends
}//class ends