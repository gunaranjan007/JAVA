class Employee
{
	int netsalary=0,DA=0,HRA=0,CCA=0,grosssalaryAmt=0,LIC=0,HI=0,PF=0,loanAmt=0,totalDeduction=0;///Data members of net salary
	int grade;// Mentioned hered for bonus calculation
	int bonus=0;
	int totalnetsalary=0;
	String name;
	int empId,basicpay;  //Employee data members 
	Employee(String name,int empId,int basicpay)
	{
		this.name=name;
		this.empId=empId;
		this.basicpay=basicpay;
	}
    public void netsalary()//RETURN NET SALARY
    {
        netsalary = calculategross(basicpay) - calculate_deductions(basicpay);

        if (grade == 1)
            bonus = netsalary / 10;
        else if (grade == 2)
            bonus = 0;

        totalnetsalary = netsalary + bonus;
    }
	
	protected  int calculategross(int basicpay)// RETURN GROSS SALARY
	{
		DA = basicpay * 6 / 100;
        HRA = basicpay * 8 / 100;
        CCA = basicpay * 5 / 100;
		grosssalaryAmt=basicpay+DA+HRA+CCA;
		
	return(grosssalaryAmt);
	}
		
	protected  int calculate_deductions(int basicpay)//RETURN TOTAL DEDUCTION
	{
		LIC = basicpay * 8 / 100;
        HI = basicpay * 4 / 100;
        PF = basicpay * 12 / 100;
        loanAmt = basicpay * 15 / 100;
		
		 totalDeduction=LIC+HI+PF+loanAmt;
	return(totalDeduction);
	}
	public void payslip()//to print the slip
	{
		
		netsalary();
		
		System.out.println("Grade : "+grade);
		System.out.printf("Basic pay %25d\n" ,basicpay);
		System.out.printf("Dearness Allowance[DA] %12d\n" ,DA);
		System.out.printf("House Rent Allowance[HRA] %9d\n" ,HRA);
		System.out.printf("Compensatory Allowance [CCA] %6d\n" ,CCA);
		System.out.println("-------------------------------------" );
		System.out.printf("GROSS AMOUNT =%21d\n",grosssalaryAmt);
		System.out.println("-------------------------------------" );
		
		System.out.printf("Bonus amount [Bonus] %10d\n",bonus);
		int bonusAmt=grosssalaryAmt+bonus;
		
		System.out.println("The Salary after added Bonus "+bonusAmt);
		System.out.println("-------------------------------------");
		System.out.println("Total Deductions");
		System.out.printf("Life Insurance company [LIC]%8d\n" ,LIC);
		System.out.printf("Health Insurance [HI] %14d\n" ,HI);
		System.out.printf("Providend Fund  [PF] %15d\n" ,PF);
		System.out.printf("Loan Amount   [LOAN] %17d\n" ,loanAmt);
		System.out.println("-------------------------------------" );
		System.out.printf("TOTAL DETECTIONS  =%17d\n",totalDeduction);
		System.out.println("-------------------------------------" );
		
		
		System.out.println("-------------------------------------" );
		System.out.println("Total Net Salary is equal to = " + totalnetsalary);
		System.out.println("-------------------------------------" );
	
	}	//payslip method ends


}//class Employee Ends

class Emp_grade1 extends Employee
{
	Emp_grade1(String name,int empId,int basicpay,int grade)//constructor
	{
		super(name,empId,basicpay);
		this.grade=grade;
	}
	
}//SUB class Emp_grade1 Ends

class Emp_grade2 extends Employee
{
	Emp_grade2(String name,int empId,int basicpay,int grade)//Constructor
	{
		super(name,empId,basicpay);
		this.grade=grade;
	}
}//SUB class Emp_grade2 Ends

public class employeehierarchy
{
	public static void main(String args[])
	{
		Emp_grade1  emp1 =new Emp_grade1("guna",201,35000,1);//Object for sub class 1 
		Emp_grade2  emp2=new Emp_grade2("ragul",203,50000,2);//object for sub class 2 
		emp1.payslip();
		emp2.payslip();
	
	}
}//public class ends
		
		
	
	