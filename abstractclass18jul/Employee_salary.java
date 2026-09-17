import java.util.Scanner;
abstract class Employee
{
	String name;
	int empId=0,grade=0,salary=0;
	Employee(String name,int empId,int salary ,int grade)//abstract class constructor 
	{
		this.name=name;
		this.empId=empId;
		this.salary=salary;
		this.grade=grade;
	}
	abstract int incentive_calculation(int empId,int salary,int grade); //Abstract method //no body 
}
class Employee_incentive extends Employee//single inheritance 
{
	Employee_incentive(String name,int empId ,int salary,int grade)//constructor Employee_incentive 
	{
		super(name,empId,salary,grade);
	}
	@Override public int incentive_calculation(int empId ,int salary,int grade)//override with same signature and return type 
	{
		int incentive=0;
		if (grade==1)
		{
			 incentive=salary/6;
		}
		else if (grade ==2)
		{
			incentive=salary/10;
		}
			
		int incentive_salary=salary+incentive;
			return(incentive_salary);
		
	}
}
public class Employee_salary
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		int Grade=0;
		System.out.print("Enter your Grade :");
		Grade=input.nextInt();
		Employee_incentive emp1=new Employee_incentive("Guna",101,35000,Grade);
		int status= emp1.incentive_calculation(101,35000,Grade);
		System.out.print("Your final added incentive is "+status);
		
	}//psvm ends
}//public class Employee_salary Ends
		
		
		
	
	
