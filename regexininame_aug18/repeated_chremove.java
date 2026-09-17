import java.util.Scanner;
class repeated_chremove
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		
		String sentence;
		System.out.print("Enter the word :");
		sentence=input.nextLine();
		
			StringBuilder word=new StringBuilder(sentence);
			
			int j=0;
			for(int i=0;i<word.length()-1;i++)
			{
				j=i+1;
				if(word.charAt(i)==word.charAt(j))
				{
					word=word.deleteCharAt(j); 
				} 
			}
			System.out.print(word);
	}//Psvm Ends 
}//class ends 
		