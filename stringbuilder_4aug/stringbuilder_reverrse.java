import java.util.Scanner;
class Stringbuilder_reverrse
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String name="sivasakthi";
		String place="chennai";

		StringBuilder sb=new StringBuilder();
		
		sb=sb.append(place);
		
		StringBuilder reverseSentence=new StringBuilder();
		
		reverseSentence =reverseString(sb);
		System.out.print(reverseSentence);
	}
		
	static StringBuilder reverseString(StringBuilder sentence)
	{
		StringBuilder reverse=new StringBuilder();
		for(int i=sentence.length()-1;i>=0;i--)
		{
		     reverse.append(sentence.charAt(i));
		}
	return(reverse);
	}
	
}