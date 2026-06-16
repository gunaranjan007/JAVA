import java.util.Scanner;
import java.lang.Math;//imported because to generate the Randomnumber
class randomasteriskgame
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String guessasterisk="";
		String[] personality={"nehru","gandhi","abraham","kalam","waj bai","modi","subash","indira","mohan","walter"};//If the chance is seven then the number of character is also been lessthan or equal to 7
			 
	       int guessNum=randomnumGenerate();
		   String gamePersonality=personality[guessNum];
		   String asterisk="";
		    char[] sample=chararrayChange(gamePersonality);//Create sample char array to use only for checking 
           char[] chpersonality=chararrayChange(gamePersonality);//Actuall changing char array
		   for(int i=0;i<sample.length;i++)
		   {
			   if(sample[i]==' ')               //SIMPLEARRAY IS still the character array
				   chpersonality[i]=' ';
			   else
				   chpersonality[i]='*';
		   }
		   asterisk=asterisk.copyValueOf(chpersonality,0,chpersonality.length);//COPYVALUEOF
	        System.out.println(asterisk);//Used copyvalue of to convert the char array ro String
		  
			 
		  for(int i=0;i<7;i++)
		  {
			  System.out.print("Enter the Guessed Character: ");
			  char character=(input.nextLine()).charAt(0);//heree call by refernce is occuring so be careful while taking array to an new function
			  for(int j=0;j<sample.length;j++)
			  {
				  if(sample[j]==character)
				  {
					  chpersonality[j]=character;
				  }  
			  }
			     guessasterisk=guessasterisk.copyValueOf(chpersonality,0,chpersonality.length);
		     System.out.println(guessasterisk);
			 if(gamePersonality.equals(guessasterisk))
			 {
				 System.out.print("Hurray! You won");           //If Answer is correct tells sop and Break the loop
				 break;
			 }
		  }
	}	   
	static int randomnumGenerate() // Used to Generate Random nunmbers
	{
		int num=0;
		num=(int)(Math.random()*10);
		return (num);
	}//randomnum generate fun ends
	static char[] chararrayChange(String word)//Used to convert the string to Char Array
	{
		char[] chararray=word.toCharArray();
		return(chararray);
	}//char array func ends
		

}
		
		