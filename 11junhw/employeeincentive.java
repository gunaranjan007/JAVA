import java.util.Scanner;
class Employee
{
	private int empid, performance;//Attributes 
	 int incentive=0;
	Employee()//constructor class with no parameter  
	{
		empid=0;
		performance=0;
	}
	Employee(int empid)
	{
		this.empid=empid;
	}
	Employee(int empid,int performance)//constructor class with parameterized
	{
		int hike=0;
		this.empid=empid;
		this.performance=performance;
		hike=incentivecheck(performance);//Args passing 
		System.out.print("You will  got "+hike+" incentive ");
	}
	public int incentivecheck(int dperformance)
	{
		if(dperformance==1)
		   incentive =2000;
	   else if(dperformance==2)
		   incentive=1000;
	   else if (dperformance==3)
		   incentive=500;
	   
	 return(incentive);
	}
		   
}//class Employee ends
public class employeeincentive
{
	static Scanner input=new Scanner (System.in);
	public static void main(String args[])
	{
		System.out.print("Enter your performance in current year:");
		int performance1=input.nextInt();
		Employee emp1=new Employee();//obj1
		int incentive1=emp1.incentivecheck(performance1);
		System.out.print("Your incentive is "+incentive1);
		System.out.println();  
		
		System.out.print("Enter your Performance :");
		int performance2=input.nextInt();
		Employee emp2=new Employee(102);//obj2
		int incentive2=emp2.incentivecheck(performance2);
		System.out.print("Your incentive is "+ incentive2);
		
		Employee emp3=new Employee(103,2);//obj3
		
		
	}
}