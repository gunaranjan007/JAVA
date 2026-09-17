interface Overtime
{
	public static final String company_name="LT Private ltd";
	public int overtime(int salary,int grade);//abstract method
	
}//interface ends
class Employee_incentive implements Overtime//implementing interface 
{
	String empName;
	int salary=0, grade =0;
	Employee_incentive(String empName,int salary,int grade )//constructor 
	{
		this.empName=empName;
		this.salary=salary;
		this.grade=grade;
	}
	@Override public int overtime(int salary,int grade)
	{
		int extra_salary=0;
		if (grade==1)
			extra_salary=salary/10;
		else if (grade==2)
			extra_salary=salary/15;
		
		int overall_salary=extra_salary+salary;
	return(overall_salary);
	}//override ed overtime method ends
	
}
public class Employee_interface
{
	public static void main(String args[])
	{
		Employee_incentive emp1=new Employee_incentive("guna",35000,2);
		System.out.println("The Overall money after overduty is "+emp1.overtime(35000,2));
		
        Employee_incentive emp2=new Employee_incentive("raju",40000,1);
		System.out.println("The Overall money after overduty is "+emp1.overtime(40000,1));
		
		System.out.print(emp1.company_name);
	}
}
		
			
	
	