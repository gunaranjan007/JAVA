import java.util.Scanner;
class copyValueOfString
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String word,str="";
		System.out.print("Enter any word:");
		word =input.nextLine();
		
		char[] word1=word.toCharArray();// string to char Array
		str=str.copyValueOf(word1,0,word1.length);// char Array to the string 
		
		System.out.print("The String from Char Array:"+str);
		
		
	}//psvm ends
}//class ends