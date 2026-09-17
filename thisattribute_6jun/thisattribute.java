import java.util.Scanner;
class Voter
{
	
	private int age=0;
	private String name=" ";
	private char adhaar=' ';
	private int response=0;
	
	
	public void adhaar(int age,String name,char adhaar)//arg of Main
	{
		this.age=age;
		this.name=name;                        // class belonging variable (attributes)
		this.adhaar=adhaar;
		adhaareligible();                     //this used to unchange the name of the argument which is passed by the main class
		if(response==1)
			System.out.print("You are eligible to vote");
	    else
			System.out.print("You are not eligible to vote");
	}
		
		
	private int  adhaareligible()
	{
		if((age>=18)&& (adhaar=='y'||adhaar=='Y'))
			response=1;
		else
			response=0;
	return(response);
		
	}

}
public class thisattribute
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		int yourage=0;
		String yourname;
		char statement;
		System.out.print("Enter your Name:");
		  yourname=input.nextLine();
		System.out.print("Enter your age");
		  yourage=input.nextInt();
		String  aa=input.nextLine();//Used after integer input to avoid error
		System.out.print("Do you have adhaar(yes/no):");
		  statement=input.nextLine().charAt(0);
		Voter guna=new Voter();// guna is an object here
		guna.adhaar(yourage,yourname,statement);
	}
}