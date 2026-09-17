import java.util.Scanner;
interface extraclass 
{
	//public static final String uniform ="blue"; //data members 
	
	public int class_timings(int grade);//abstract  method 
	
}//interface extraclass ends
class School implements extraclass
{
	int grade=0;
	School(int grade)//constructor 
	{
		this.grade=grade;
	}
	@Override public int class_timings(int grade)
	{
		int timing=0;
		if((grade>=10) && (grade<=12))
		{
			timing=30;
		}
		return(timing);	
	}
}//class school ends
public class School_interface
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.print("Enter your current Standard:");
		int standard=input.nextInt();
		School stu1=new School(standard);
		System.out.print("YOU Have to come "+stu1.class_timings(standard)+"minutes earlier to class ");
		stu1.class_timings(standard);
	}
}//public class Ends 

	
	