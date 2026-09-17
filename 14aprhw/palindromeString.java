import java.util.Scanner;
class palindromeString
{
	static Scanner input=new Scanner(System.in);
	public static void main(String [] args)
	{
		int i=0;
		System.out.print("Enter the words:");
		String word=input.nextLine();
		
		if(word.isEmpty())
			System.out.print("Enter words you Have not entered that");
		
		for(i=word.length(); i>=0;i--)
			String reverse +=word.charAt(i);
		
		if (reverse.equals(word))
		     System.out.print("Palindrome");
		 else 
			 System.out.print("Not Palindrome");
		
	}//psvm ends
}//class ends
		