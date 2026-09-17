import java.util.Scanner;
class voweltoasterisk
{
	static Scanner input=new Scanner(System.in);
	public static void main (String args[])
	{
		String word,lword;
		String fin="";//it should be given likes this because it only added the concatinated value in the fin string 
		System.out.print("Enter Any word:");
		word=input.nextLine();
		lword=word.toLowerCase();//change each and every word into the lowercase
		for(int i=0;i<lword.length();i++)//check iteratively
		{
			char ch=lword.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')//checks
				fin+="*";
			else
				fin+=ch;//using concatination to add in an string 
		}//loop ends
		System.out.print(fin);
	}//psvm ends
}//class ends