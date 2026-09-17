interface Employee
{
    abstract public void createEmployee(String empName, int empId);
    abstract public int grossSalary(int basicPay);
    abstract public char grade(int grossSalary);
}

// Interface ends

class Company
{
    String empName;
    int empId;

    Company(String empName, int empId)
    {
        this.empName = empName;
        this.empId = empId;
    }
    public void employeeJoining(Employee emp)//object refernce of the interface Employee
    {
        emp.createEmployee(empName, empId);
        System.out.println("Employee created successfully");
    }
}//class Company ends

class EmployeeDetails implements Employee
{
    String empName;
    int empId,basicPay;//data members
    int hra,da,gross;
    char grade;

    EmployeeDetails(String empName, int empId, int basicPay)
    {
        this.empName = empName;
        this.empId = empId;
        this.basicPay = basicPay;
    }
    @Override public void createEmployee(String empName, int empId)
    {
        System.out.println("Employee Name : " + empName);
        System.out.println("Employee ID   : " + empId);
    }
	@Override public int grossSalary(int basicPay)
    {
        hra = (basicPay * 20) / 100;
        da = (basicPay * 10) / 100;
        gross = (basicPay + hra + da);
        return (gross);
    }

    @Override public char grade(int gross)
    {
        if (gross >= 70000)
            grade = 'A';
        else if (gross >= 50000)
            grade = 'B';
        else if (gross >= 30000)
            grade = 'C';
        else
            grade = 'D';
        return (grade);
    }
}//EmployeeDetails ends

public class Employee_interfaces
{
    public static void main(String args[])
    {
		Employee emp = new EmployeeDetails("guna", 101, 50000);//
        Company cmp = new Company("guna", 101);
        cmp.employeeJoining(emp);

        System.out.println("Gross Salary : " + emp.grossSalary(50000));
        System.out.println("Employee Grade : " + emp.grade(emp.grossSalary(50000)));
    }
}//public class ends
