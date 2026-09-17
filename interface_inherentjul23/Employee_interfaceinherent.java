import java.util.Scanner;
interface extra_payable//extra increment by an company without any criteria 
{ 
   public static final int yearly_increment=2000;
   public int extra_basicpay(int basicPay);//abstract method 
}
interface bonus_eligible//bonus amount given by a company 
{
	public int bonusEligibility(int basicPay,int grade);//abstract method 
}
interface trip_eligible//trip offering by company by( duration and grade )
{
	public static final int trip_duration=10; //constant
	public String TripEligibility(int grade,int duration);//abstract method
}

class Employee_pay implements extra_payable,bonus_eligible
{
	String name;
	int empId=0,basicPay=0,grade=0;//data members //instance variables 
	
	Employee_pay(String name,int empId,int basicPay,int grade)//constructor of class Employee_pay
	{
		this.name=name;
		this.empId=empId;
		this.basicPay=basicPay;
		this.grade=grade;
	}
	@Override public int extra_basicpay(int basicPay)//concrete method 
	{
		int updated_salary=yearly_increment+basicPay;
		return(updated_salary);	
	}
	@Override public int bonusEligibility(int basicPay,int grade)//concrete method
	{
		int bonusAmt=0;
		if ((basicPay>50000) && (grade==1))
			bonusAmt=basicPay/10;
		else if ((basicPay>50000) && (grade==2))
			bonusAmt=basicPay/15;
		else if ((basicPay<50000) && (grade==1))
			bonusAmt=basicPay/12;
		else if ((basicPay<50000) && (grade==2))
			bonusAmt=basicPay/16;
		
		return(bonusAmt);	
	}
	
}
class Employee_trip extends Employee_pay implements trip_eligible//single inheritance 
{
	int duration=0;
	Employee_trip(String name,int empId,int basicPay,int grade,int duration)
	{
		super(name,empId,basicPay,grade);
		this.duration=duration;
	}
	public String TripEligibility(int grade,int duration)//concrete method
    {
		String status;
		
		if((grade==1) && (duration>10))
			status="Eligible";
		else if ((grade==2) && (duration>12))
			status ="Eligible";
		else 
			status ="Not Eligible";
	return(status);
			
	}	
	
}//class Employee_trip Ends 

public class Employee_interfaceinherent
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		
			System.out.print("When was your last trip alloted by the company(in months):");
	         int month=input.nextInt();
			 Employee_pay emp1=new Employee_pay("guna",101,35000,2);
			 
			int updated_basicPay= emp1.extra_basicpay(35000);
			System.out.println("Your new  Updated Salary is :"+updated_basicPay);
			
			 int bonusAmt=emp1.bonusEligibility(35000,2);
			 System.out.println("you got bonus Amount of "+bonusAmt+"rupees");
			 
			Employee_trip emp2=new Employee_trip("raj",102,56000,1,month);
			  String status=emp2.TripEligibility(1,month);
			System.out.println("you are "+status+" for upcoming trip ");
			    if(status.equals("Eligible"))
				    System.out.println("You will Get"+ emp2.trip_duration+" days of leave");
	  
	}
}