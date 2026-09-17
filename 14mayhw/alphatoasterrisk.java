import java.util.Scanner;
class alphatoasterrisk
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String word;
		String z="";
	
		System.out.print("Enter any word:");//string
		word =input.nextLine();
	    char[] ch=word.toCharArray();//Change the string to char array
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
				ch[i]='*';//Process
			else
				ch[i]=' ';
		
		}
		z=z.copyValueOf(ch,0,ch.length);//after process change the array into the string
		System.out.print(z);

		
	}//psvm ends
}//class ends