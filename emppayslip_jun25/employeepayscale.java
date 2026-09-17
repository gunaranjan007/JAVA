class Loaneligible
{
	static  int loanEligiblecalculation(Employee emp1,Employee emp2)
	{
		int Eligibility=0;
		int eligibleloanamt=120000;
		int amount1=emp1.totalnetsalary+emp2.totalnetsalary;
		if(amount1>eligibleloanamt)
			Eligibility=1;
		else
			Eligibility=0;
		
	return(Eligibility);
	}
}
class Employee
{
	
	
	public int empId,basicPay;   //Encapsulation of data members or (Attributes)
	private String name;
	int totalnetsalary;
    int grosssalaryAmt=0,totalDeduction=0;
	private int DA=0,HRA=0,CCA=0, LIC=0,HI=0,PF=0,loanAmt=0;//encapsulated cannot been acess from outside 
	Employee(String name,int empId,int basicPay)//constructor with parameter name ,EmpId,basicPay
	{
		this.name=name;
		this.empId=empId;
		this.basicPay=basicPay;
	}
	
	public void netsalary()
	{
		totalnetsalary=calculateGross(basicPay)-calculatedeductions(basicPay);
		System.out.print("Net Salary is"+totalnetsalary);
	}
	
	public void payslip()//to print the slip
	{
		System.out.printf("Basic pay %25d\n" ,basicPay);
		System.out.printf("Dearness Allowance[DA] %12d\n" ,DA);
		System.out.printf("House Rent Allowance[HRA] %9d\n" ,HRA);
		System.out.printf("Compensatory Allowance [CCA] %6d\n" ,CCA);
		System.out.println("-------------------------------------" );
		System.out.printf("GROSS AMOUNT =%21d\n",grosssalaryAmt);
		System.out.println("-------------------------------------" );
		
		System.out.print("Total Deductions");
		System.out.printf("Life Insurance company [LIC]%8d\n" ,LIC);
		System.out.printf("Health Insurance [HI] %14d\n" ,HI);
		System.out.printf("Providend Fund  [PF] %15d\n" ,PF);
		System.out.printf("Loan Amount   [LOAN] %17d\n" ,loanAmt);
		System.out.println("-------------------------------------" );
		System.out.printf("TOTAL DETECTIONS  =%17d\n",totalDeduction);
		System.out.println("-------------------------------------" );
		
		
		System.out.println("-------------------------------------" );
		System.out.print("Total Net Salary is equal to = " + totalnetsalary);
		System.out.println("-------------------------------------" );
	
	}	//payslip method ends
	
	private  int calculateGross(int basicpay)// Calculate gross from basic pay
	{
		 //local variables 
		DA=basicpay/10;
		HRA=basicpay/8;
		CCA=basicpay/5;
		grosssalaryAmt=basicpay+DA+HRA+CCA;
		
	return(grosssalaryAmt);
	}
		
	private  int calculatedeductions(int basicpay)
	{
		
		LIC=basicpay/8;
		HI=basicpay/4;
		PF=basicpay/12;
		loanAmt=basicpay/25;
		
		 totalDeduction=LIC+HI+PF+loanAmt;
	return(totalDeduction);
	}
}//class Employee ends
		

public class employeepayscale
{
	public static void main(String args[])
	{
		Employee emp1=new Employee("guru",101,50000);
		Employee emp2=new Employee("guna",102,74000);//name,empid,basicpay salary
	    emp1.netsalary();
		emp1.payslip();
	    int isEligible=Loaneligible.loanEligiblecalculation(emp1,emp2);//Passing object as a argument
		if(isEligible==1)
			System.out.print("YOU ARE ELIGIBLE TO GET A LOAN");
		else
			System.out.print("YOU ARE NOT ELIGIBLE TO GET A LOAN");
	}//psvm ends
		
}//public class EmployeePayscale Ends 
		