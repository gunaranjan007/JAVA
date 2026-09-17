import java.util.Scanner;
class Vote
{
	static Scanner input=new Scanner(System.in);
	private String name;
	private int age;
	
	public void initialize()
	{
		name="";
		age=0;
	}


	public void voteeligibility()
	{
		int waitduration=0;
		System.out.print("Enter your age");
	    age=input.nextInt();
		if(age>=18)
			System.out.print("You are eligible to vote ");
		else 
			 waitduration=18-age;
	}
}//class ends
public class voteageclass
{
	public static void main(String args[])
	{
		Vote guna=new Vote();
		guna.voteeligibility();
	}
}
		