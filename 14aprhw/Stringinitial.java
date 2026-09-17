import java.util.Scanner;
class Stringinitial
{
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter your Name:");
		String name=input.nextLine();
		
		if(name.isEmpty())
			System.out.print("you haven't entered your name");
		
		String initial=name.substring(0,2);//0 is beginning index and 2 is count 
		String sur_name=name.substring(2,name.length());
		String final_name=(sur_name+initial);
		System.out.print(final_name);
	}
}
	