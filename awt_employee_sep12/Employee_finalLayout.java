import java.util.Scanner;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


 class EmployeeMethods
{
	public int lic,hi,pf; // variables of deductions mthd
	public int hra,da,cca;// variables of grossSalary method
	
	 //GROSS SALARY METHOD
     public  int grossSalary(int basic_pay)
	{
		 hra=(basic_pay*20)/100;
		 da=(basic_pay*10)/100;
		 cca=(basic_pay*8)/100;
		int gross_salary=(hra+da+cca+basic_pay);                                           //Wt to add employee name and employee ID
	
	return(gross_salary);
	}
	
	//DEDUCTION METHOD
	 public   int deductions(int basic_pay)
	{
		lic=(basic_pay*10)/100;
		hi=(basic_pay*8)/100;
		pf=(basic_pay*12)/100;
		int deduction=(basic_pay-(lic+hi+pf));
		
	return(deduction);	
	}
	
	//NETSALARY METHOD
	 public int netSalary(int basicPay)
	{
		int netSalary=0;
		netSalary=(grossSalary(basicPay)-deductions(basicPay));
		
	return(netSalary);
	}//mthd netSalary Ends
		
		
}//class employeeMethod Ends
	
class Employee_details extends JFrame
{
	String empName;
	int empId=0;
	
	//CREATING EMPLOYEEMETHODOBJ FOR ACCESS THE EMPLOYEE METHODS AND VARIABLES 
	EmployeeMethods employeeMethodobj=new EmployeeMethods();   // creating an object for using and Calling Methods
	
	private JLabel  basicPay_label,da_label,hra_label,cca_label,gross_label,lic_label,hi_label,pf_label,deduction_label,netSalary_label,loanStatus_label,empName_label,empId_label;
	private JTextField tf_basicPay,tf_da,tf_hra,tf_cca,tf_hi,tf_pf,tf_lic,tf_gross,tf_deduction,tf_netSalary,tf_loanStatus,tf_empName,tf_empId;
	private JButton grossButton,deductionButton,netSalaryButton;
	
	
	//LOAN LABELS AND TEXTFIELDS
	 int empLoanAmount=0;
		
		//int empLoanAmount=0;//final monthly loan due amount after handling and calculation

			private JLabel label_loan,label_interest;
			private JTextField tf_loanamount,tf_interest,tf_monthlydue;//tf3 for Display  monthly loan amount
			private JButton calcButton;
	
	
	Employee_details(String empName,int empId) //constructor
	{
		super("SALARY CALCULATION");
		
		this.empName=empName;
		this.empId=empId;
		
		setLayout(new FlowLayout());
	    payslip_Txtfldhld handler=new payslip_Txtfldhld();
		
		empName_label=new JLabel("Employee Name :");
		add(empName_label); 
		tf_empName=new JTextField(20);
		add(tf_empName);  
		
		tf_empName.setText(empName);
		
		empId_label=new JLabel("Employee Identity :");
		add(empId_label); 
		tf_empId=new JTextField(10);
		add(tf_empId);  
		tf_empId.setText(Integer.toString(empId));
		
		
	
		basicPay_label=new JLabel("Enter your basic pay");
		add(basicPay_label);
		tf_basicPay=new JTextField(15);
		add(tf_basicPay);  //setText that user action command 
		tf_basicPay.addActionListener(handler);


        //GROSS
		da_label=new JLabel("Your Dearness Allowance :");
		add(da_label);
		tf_da=new JTextField(15);
		add(tf_da); //setText is calculated 
		tf_da.addActionListener(handler);
		
		
		hra_label=new JLabel("Your House Rent Allowance:");
		add(hra_label); 
		tf_hra=new JTextField(15);
		add(tf_hra);  //setText is calculated 
		tf_hra.addActionListener(handler);
		
		
		
		
		cca_label=new JLabel("Your Compensatory Allowance :");
		add(cca_label);
		tf_cca=new JTextField(15);
		add(tf_cca);  //setText is calculated  
		tf_cca.addActionListener(handler);
		
		
		gross_label=new JLabel("Your Gross Salary :");  //TO DIsplay the gross salary 
		add(gross_label);
		tf_gross=new JTextField(15);
		add(tf_gross);  //setText is calculated  
		tf_gross.addActionListener(handler);
		tf_gross.setEnabled(false);// // user cannot allows to access(just used to display results)
		
		grossButton=new JButton("Gross Salary");// hold to calculate gross salary
		add(grossButton);
		grossButton.addActionListener(handler);


        //DEDUCTIONS
		lic_label=new JLabel("Your Life Insurance Company [lic] :");
		add(lic_label);
		tf_lic=new JTextField(15);
		add(tf_lic);  //setText is calculated  
		tf_lic.addActionListener(handler);
		
 
		hi_label=new JLabel("Your Health Insurance [HI]:");
		add(hi_label);
		tf_hi=new JTextField(15);
		add(tf_hi);  //setText is calculated  
		tf_hi.addActionListener(handler);
		
		loanStatus_label=new JLabel("DO YOU HAVE LOAN :");
		add(loanStatus_label);
		tf_loanStatus=new JTextField(15);
		tf_loanStatus.addActionListener(handler);
		add(tf_loanStatus);
				
		
		pf_label=new JLabel("Your Provident Fund [PF]:");
		add(pf_label);
		tf_pf=new JTextField(15);
		add(tf_pf);  //setText is calculated  
		tf_pf.addActionListener(handler);
		

		deduction_label=new JLabel("Your Calculated Deduction Amount :");
		add(deduction_label);
		tf_deduction=new JTextField(15);
		add(tf_deduction);  //setText is calculated  
		tf_deduction.addActionListener(handler);
		tf_deduction.setEnabled(false);  // user cannot allows to access(just used to display results)
		
		
		deductionButton=new JButton("Deduction");
		add(deductionButton);
		deductionButton.addActionListener(handler);
		
		 
		//NETSALARY 
		netSalary_label=new JLabel("Your netSalary Amouny:");
		add(netSalary_label);
		tf_netSalary=new JTextField(15);
		add(tf_netSalary);  //setText is calculated  
		tf_netSalary.addActionListener(handler);
		tf_netSalary.setEnabled(false);//  user cannot allows to access(just used to display results)
		
		
		netSalaryButton=new JButton("Net Salary");
		add(netSalaryButton);
		netSalaryButton.addActionListener(handler);
		
		LoanCalculation loanHandler=new LoanCalculation();
				
				label_loan=new JLabel("Enter yout total loan Amount:");
				add(label_loan);
				tf_loanamount=new JTextField(10);
				add(tf_loanamount);
				tf_loanamount.addActionListener(loanHandler);
				
				label_interest=new JLabel("Enter your Interest :");
				add(label_interest);
				tf_interest=new JTextField(10);
				add(tf_interest);
				tf_interest.addActionListener(loanHandler);
				
				tf_monthlydue=new JTextField(10);
				add(tf_monthlydue);
				tf_monthlydue.setEnabled(false);
				
				calcButton=new JButton("Calculate");
				add(calcButton);
				calcButton.addActionListener(loanHandler);
			
		
	}//constructor Employee_details Ends
	
	
	// HANDLER//
	private class payslip_Txtfldhld implements ActionListener   // The class which is used to handle the gorss ,deduction and netsalary
    {
		int empBasicPay=0;
		public void actionPerformed(ActionEvent event)
		{
			String str_basicPay="",str_loanStatus="";
			
			char loanStatus;
			if(event.getSource()==tf_basicPay)
			{
				str_basicPay=event.getActionCommand();   // get action command as string 
				empBasicPay=Integer.parseInt(str_basicPay); // convert that string into integer(primitive)
				if(empBasicPay<0)
				{
					tf_basicPay.setEnabled(false);
				}
				tf_basicPay.setText(Integer.toString(empBasicPay));//and also convert that int to string and set in the text field
			}
			
			
			//GROSS SALARY 
			if(event.getSource()==grossButton)//calculation has to occurs
			{
				int empGrossSalary=employeeMethodobj.grossSalary(empBasicPay);
				tf_hra.setText(Integer.toString(employeeMethodobj.hra));
				tf_da.setText(Integer.toString(employeeMethodobj.da));
				tf_cca.setText(Integer.toString(employeeMethodobj.cca));
				tf_gross.setText(Integer.toString(empGrossSalary));	
			}
			
			//LOAN STATUS
			if(event.getSource()==tf_loanStatus)
			{
				//JOptionPane.showMessageDialog(null,"laon status");
				tf_loanStatus.setEnabled(true);
				str_loanStatus=event.getActionCommand();
				loanStatus=str_loanStatus.charAt(0);
				if(loanStatus=='y' || loanStatus=='Y')
				{
					Loanamount loanobj=new Loanamount();
					JOptionPane.showMessageDialog(null,"loanstatus");
					tf_loanStatus.setText(Integer.toString(loanobj.empLoanAmount));
				}
				//Loanamount loanobj1=new Loanamount();
			}
			
			
			//DEDUCTION 
			if(event.getSource()==deductionButton)//calculation has to occurs
			{
				int empDeduction=employeeMethodobj.deductions(empBasicPay);
				tf_lic.setText(Integer.toString(employeeMethodobj.lic));  //varibles of class EmployeeMethods
				tf_hi.setText(Integer.toString(employeeMethodobj.hi));
				tf_pf.setText(Integer.toString(employeeMethodobj.pf));
				tf_deduction.setText(Integer.toString(empDeduction));	
			}
			
			//NETSALARY
			if(event.getSource()==netSalaryButton)
			{
				int empNetSalary=0;
				empNetSalary=employeeMethodobj.netSalary(empBasicPay);
				tf_netSalary.setText(Integer.toString(empNetSalary));
			}
	
		}
    }//private Payslip_Txtfldhld class Ends 

	private class LoanCalculation implements ActionListener   //created to check the monthly loan due  // Handles textfields of loan amount layout
	{
				
		public void actionPerformed(ActionEvent event)
		{
			int loanAmt=0,Interest=0;
			String str1="",str2="";
			if(event.getSource()==tf_loanamount)
			{
				str1=event.getActionCommand();
				loanAmt=Integer.parseInt(str1);
			}
			if(event.getSource()==tf_interest)
			{
				str2=event.getActionCommand();
				Interest=Integer.parseInt(str2);
			}
					
			//MONTHLY DUE 
			if(event.getSource()==calcButton)
				{
					empLoanAmount = loanAmt * Interest / 100;  
					tf_monthlydue.setText(Integer.toString(empLoanAmount));
				}  
		}
	}		

}//loan Amount class Ends 
	


public class Employee_finalLayout
{
	static Scanner input=new Scanner(System.in);
	public static void main(String args[])
	{
		String name="";
		int id=0;
		
		System.out.print("Enter your Name:");
		name=input.nextLine();
		System.out.print("Enter your Employee Identity Nunber");
		id=input.nextInt();
		Employee_details empobj=new Employee_details(name,id); // No  parameter has been passed that already gets from action command( form the text field)
		
		empobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		empobj.setSize(200,400);
		empobj.setVisible(true);
	
		
	}
}
	
	