import java.util.Scanner;
class behaviourofsplit
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String sentence;
		System.out.print("Enter any sentence :");
		sentence =input.nextLine();
		String[] s1=sentence.split(" ");//uses to split the Data 
		
		for(String element:s1)
			System.out.println(element);
	}//psvm ends
}//class ends