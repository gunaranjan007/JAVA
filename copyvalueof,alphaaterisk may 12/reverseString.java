import java.util.Scanner;
class reverseString
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String word,reverse="";
		System.out.print("Enter any word:");
		word =input.nextLine();
		for(int i=word.length()-1;i>=0;i--)
		{
			reverse+=word.substring(i,i+1);
		}
			System.out.println(reverse);
	}//psvm ends
}//class ends