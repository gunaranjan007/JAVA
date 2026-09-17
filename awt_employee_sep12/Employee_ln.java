import java.util.Scanner;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Employee_details extends JFrame
{
	static Scanner input=new Scanner(System.in);
	
	int deduction,lic,hi,pf; // variables of decductions mthd
	int gross_salary,hra,da,cca;// variables of grossSalary mthd
	
	int deduct,gross,netSalary;
	
	char loanStatus;
	int loanAmount=0;//final monthly loan due amount after handling and calculation
	
	private int loanAmt,Interest;
	private JLabel loan,interest;
	private JTextField tf1,tf2,tf3;//tf3 for Display  monthly loan amount
	private JButton calcButton;
	
	String empName,empId; //datamembers 
	int empBasicPay;
	
	Employee_details(String empName,String empId,int empBasicPay) //constructor
	{
		this.empName=empName;
		this.empId=empId;
		this.empBasicPay=empBasicPay;
	}
	private  int grossSalary(int basic_pay)
	{
		 hra=(basic_pay*20)/100;
		 da=(basic_pay*10)/100;
		 cca=(basic_pay*8)/100;
		gross_salary=(hra+da+cca+basic_pay);
	
	return(gross_salary);
	}
	private  int deductions(int basic_pay)
	{
		 
		lic=(basic_pay*10)/100;
		hi=(basic_pay*8)/100;
		pf=(basic_pay*12)/100;
		deduction=(basic_pay-(lic+hi+pf));
		
	return(deduction);
		
	}
	
	public void payslip_handling()
	{
		System.out.print("Do you have loan (yes/no) :"); //checking whether the Employee has loan or not //if loan is there move to private class () for loan calculations
		loanStatus=input.nextLine().charAt(0); 
		if(loanStatus=='y' || loanStatus=='Y')
		{
			Loanamount loanobj=new Loanamount();
		}
		deduct =deductions(empBasicPay)-loanAmount;;
		gross=grossSalary(empBasicPay);
		netSalary=gross-deduct;
		//payslip();
		
	}

     void payslip()//to print the slip
	{
		
		System.out.println("Hi ! "+empName+" With "+empId+" Employee Identity");
		System.out.printf("Basic pay %25d\n" ,empBasicPay);
		System.out.printf("Dearness Allowance[DA] %12d\n" ,da);
		System.out.printf("House Rent Allowance[HRA] %9d\n" ,hra);
		System.out.printf("Compensatory Allowance [CCA] %6d\n" ,cca);
		System.out.println("-------------------------------------" );
		System.out.printf("GROSS AMOUNT =%21d\n",gross);
		System.out.println("-------------------------------------" );
		
		System.out.println("Total Deductions");
		System.out.printf("Life Insurance company [LIC]%8d\n" ,lic);
		System.out.printf("Health Insurance [HI] %14d\n" ,hi);
		System.out.printf("Providend Fund  [PF] %15d\n" ,pf);
		
		
		System.out.printf("Loan Amount   [LOAN] %17d\n" ,loanAmount);
		System.out.println("-------------------------------------" );
		System.out.printf("TOTAL DETECTIONS  =%17d\n",(deduct)); //calling deduction method 
		System.out.println("-------------------------------------" );
		
		
		System.out.println("-------------------------------------" );
		System.out.println("Total Net Salary is equal to = " +( netSalary));  //Netsalary =gross-duductions 
		System.out.println("-------------------------------------" );
	}	//payslip method ends
		
	
	private class Loanamount
	{
		Loanamount()  //constructor for label Loanamount calculation
		{
			setLayout(new FlowLayout());
			
			LoanCalculation handler=new LoanCalculation();
			
			loan=new JLabel("Enter yout total loan Amount :");
			add(loan);
			tf1=new JTextField(10);
			add(tf1);
			tf1.addActionListener(handler);
			
			interest=new JLabel("Enter your Interest :");
			add(interest);
			tf2=new JTextField(10);
			add(tf2);
			tf2.addActionListener(handler);
			
			tf3=new JTextField(10);
			add(tf3);
			tf3.setEnabled(false);
			
			calcButton=new JButton("Calculate");
			add(calcButton);
			calcButton.addActionListener(handler);
		}
	}
	
	private class LoanCalculation implements ActionListener   //created to check the monthly loan due
	{
		
		public void actionPerformed(ActionEvent event)
		{
			String str1="",str2="";
			if(event.getSource()==tf1)
			{
				str1=event.getActionCommand();
			    loanAmt=Integer.parseInt(str1);
			}
			if(event.getSource()==tf2)
			{
				str2=event.getActionCommand();
			    Interest=Integer.parseInt(str2);
			}
			if(event.getSource()==calcButton)
			{
				loanAmount = loanAmt * Interest / 100;  // stored in int for access in payslip method
                tf3.setText(Integer.toString(loanAmount));
			}  
		}
	}
}
public class Employee_ln
{
	public static void main(String args[])
	{
		int salary=35000;
		
		Employee_details empobj=new Employee_details("guna","aa101",salary);
		
		empobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		empobj.setSize(200,400);
		empobj.setVisible(true);
		
		empobj.payslip_handling();
		empobj.payslip();
	
		
	}
}
	
	