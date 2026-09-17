class Employee_name
{
	String name;
	int empid=0;
	
	Employee_name(String name,int empid)//constructor of the parent class 
	{
		this.name=name;
		this.empid=empid;
	}
	
}//class Employee_name ends

class Employee_details extends Employee_name
{
	String role;
	int salary=0,updatedsalary=0;
	
	Employee_details(String name,int empid,String role,int salary)//constructor of child class
	{
		super(name,empid);
		this.role=role;
		this.salary=salary;
	}
	
	public void incentive_check()
	{
		if(salary>=35000)
			updatedsalary=salary/10+salary;
		else if (salary>=50000)
			updatedsalary=salary/10+salary; //change this
	
	}
	
	public void displaydetails()
	{
		incentive_check();
	    System.out.println("Name :"+name);
		System.out.println("Employee Id :"+empid);
		System.out.println("Role :"+role);
		System.out.println("updated salary"+ updatedsalary);
	}
	
}
public class employeeinherent
{
	public static void main(String args[])
	{
		Employee_details emp1=new Employee_details("guna",101,"developer",36000);
		Employee_details emp2=new Employee_details("ranjan",891,"manager",60000);
		
		emp1.displaydetails();
		emp2.displaydetails();
	}
}