import java.util.Scanner;
class Employee
{
	static Scanner input=new Scanner(System.in);
	private int experience=0;
	private int salary=0; //Set as private to access anywhere in the same class
	
	public void setname()
	{
		System.out.print("Enter your Name :");             //Setting a Name
		String name =input.nextLine();
	}
	public void setsalary()
	{
		System.out.print("Enter your current Salary:");        // Setting a salary
		 salary =input.nextInt();
	}
	public void setexperience()
	{
		System.out.print("Enter your year of Joining:");        // Set experience
		int year =input.nextInt();
		 experience=experiencemethod(year);
	}
	private int experiencemethod(int dyear)
	{
		int yearofexperience=2026-dyear;                         //calculate experience which is private 
		  return(yearofexperience); 
	}
	public void getincrementcheck()
	{
		if (salary<=30000 && experience>=5)
			System.out.print("You are eligilble to get an increment");            //increment check
		else
			System.out.print("Sorry, you are not eligilble to get an increment");
	}
}//class employee ends
			
public class Employeesalary
{
	public static void main(String args[])
	{
		Employee guna=new Employee(); // Guna is a object here
		guna.setname();
		guna.setsalary();
		guna.setexperience();
		guna.getincrementcheck();
	}
}
		
		