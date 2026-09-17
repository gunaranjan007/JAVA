import java.util.Scanner;
class Student
{
	static Scanner input=new Scanner(System.in);
	private String name;
	private int mark=0,total_mark=0;
	private  char passorfail;
	public void setname//setting the name
	{
		System.out.print("Enter your Name:");
		name=input.nextLine();
	}
	public void setmark()
	{
		for(int i=0;i<5;i++)
		{
		  System.out.print("Enter your Mark"+(i+1)+":");
		     mark=input.nextInt();
		  gettotal(mark);
		passorfail=getevaluation(mark); //parameter passing
		}
	}
	public void gettotalmark()//getting marks
	{
		
		System.out.println("The evaluation of your mark:"+passorfail);
		}
		System.out.print("The total mark is:"+total_mark);
	}
	private int gettotal(int dmark)//private
	{
		int total=0;
		total+=dmark;
	return(total);
	}//get total method ends
	private char getevaluation(int dmark)
	{
		char ch;
		if(dmark<=35)
			ch='f';
		else
			ch='p';
	 return(ch);
	}
		
}//class Student ends
public class getset
{
	public static void main(String args[])
	{
		Student guna=new Student();//create a new object guna 
		guna.setname();
		System.out.println();
		guna.getmark();
		System.out.println();
		
	}
}//public class ends