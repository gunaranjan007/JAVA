class Employee
{
    int netsalary = 0, DA = 0, HRA = 0, CCA = 0, grosssalaryAmt = 0;
    int LIC = 0, HI = 0, PF = 0, loanAmt = 0, totalDeduction = 0;
    int grade;
    int bonus = 0;
    int totalnetsalary = 0;

    String name;
    int empId, basicpay;

    Employee(String name, int empId, int basicpay)
    {
        this.name = name;
        this.empId = empId;
        this.basicpay = basicpay;
    }

    public void netsalary()
    {
        grosssalaryAmt = calculategross(basicpay);
        totalDeduction = calculate_deductions(basicpay);

        netsalary = grosssalaryAmt - totalDeduction;

        if (grade == 1)
            bonus = netsalary / 10;
        else if (grade == 2)
            bonus = 0;

        totalnetsalary = netsalary + bonus;
    }

    protected int calculategross(int basicpay)
    {
        DA = basicpay * 6 / 100;
        HRA = basicpay * 8 / 100;
        CCA = basicpay * 5 / 100;

        grosssalaryAmt = basicpay + DA + HRA + CCA;

        return grosssalaryAmt;
    }

    protected int calculate_deductions(int basicpay)
    {
        LIC = basicpay * 8 / 100;
        HI = basicpay * 4 / 100;
        PF = basicpay * 12 / 100;
        loanAmt = basicpay * 15 / 100;

        totalDeduction = LIC + HI + PF + loanAmt;

        return totalDeduction;
    }

    public void payslip()
    {
        netsalary();

        System.out.println("\n-------------------------------------");
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + empId);
        System.out.println("Grade         : " + grade);

        System.out.printf("Basic Pay                     : %d\n", basicpay);
        System.out.printf("Dearness Allowance (DA)       : %d\n", DA);
        System.out.printf("House Rent Allowance (HRA)    : %d\n", HRA);
        System.out.printf("Compensatory Allowance (CCA)  : %d\n", CCA);

        System.out.println("-------------------------------------");
        System.out.printf("Gross Salary                  : %d\n", grosssalaryAmt);

        System.out.printf("Bonus                         : %d\n", bonus);
        System.out.printf("Salary After Bonus            : %d\n", grosssalaryAmt + bonus);

        System.out.println("-------------------------------------");
        System.out.println("Deductions");

        System.out.printf("Life Insurance (LIC)          : %d\n", LIC);
        System.out.printf("Health Insurance (HI)         : %d\n", HI);
        System.out.printf("Provident Fund (PF)           : %d\n", PF);
        System.out.printf("Loan Amount                   : %d\n", loanAmt);

        System.out.println("-------------------------------------");
        System.out.printf("Total Deductions              : %d\n", totalDeduction);
        System.out.println("-------------------------------------");
        System.out.printf("Net Salary                    : %d\n", netsalary);
        System.out.printf("Total Net Salary              : %d\n", totalnetsalary);
        System.out.println("-------------------------------------");
    }
}

class Emp_grade1 extends Employee
{
    Emp_grade1(String name, int empId, int basicpay, int grade)
    {
        super(name, empId, basicpay);
        this.grade = grade;
    }
}

class Emp_grade2 extends Employee
{
    Emp_grade2(String name, int empId, int basicpay, int grade)
    {
        super(name, empId, basicpay);
        this.grade = grade;
    }
}

public class gptshit
{
    public static void main(String args[])
    {
        Emp_grade1 emp1 = new Emp_grade1("Guna", 201, 35000, 1);
        Emp_grade2 emp2 = new Emp_grade2("Ragul", 203, 50000, 2);

        emp1.payslip();
        emp2.payslip();
    }
}