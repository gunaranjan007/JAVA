import java.util.Scanner;
class asterriskgame
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String word;
		String initial="",stepast="";
	
		System.out.print("Enter any word:");//string
		word =input.nextLine();
	    char[] charray=word.toCharArray();//Change the string to char array
		char[] charr=word.toCharArray();
		for(int i=0;i<charray.length;i++)
		{
			if(charray[i]==' ')
				charr[i]=' ';//Process
			else
				charr[i]='*';
		
		}
		initial=initial.copyValueOf(charr,0,charr.length);//after process change the array into the string
		System.out.print(initial);
		for(int j=0;j<7;j++)
		{
			System.out.printf("\n %d guess \n",j+1);
			System.out.print("\nEnter character:");
			  char character=input.next().charAt(0);
			
			
		    for(int i=0;i<charr.length;i++)
		    {
			  if(charray[i]==character)
				 charr[i]=character;//Process 
			 
		    }
		 stepast=stepast.copyValueOf(charr,0,charr.length);//after process change the array into the string
		 System.out.println(stepast);
		}
	}
}
		
	