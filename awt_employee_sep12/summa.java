


import java.util.Scanner;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


// ======================================================
// EmployeeMethods
// ======================================================

class EmployeeMethods
{
    public int lic, hi, pf;
    public int hra, da, cca;

    public int grossSalary(int basic_pay)
    {
        hra = (basic_pay * 20) / 100;
        da = (basic_pay * 10) / 100;
        cca = (basic_pay * 8) / 100;

        int gross_salary = hra + da + cca + basic_pay;

        return gross_salary;
    }

    public int deductions(int basic_pay)
    {
        lic = (basic_pay * 10) / 100;
        hi = (basic_pay * 8) / 100;
        pf = (basic_pay * 12) / 100;

        // Total deduction
        int deduction = lic + hi + pf;

        return deduction;
    }

    public int netSalary(int basicPay)
    {
        int netSalary = 0;

        netSalary = grossSalary(basicPay) - deductions(basicPay);

        return netSalary;
    }
}


// ======================================================
// Employee_details
// ======================================================

class Employee_details extends JFrame
{
    static Scanner input = new Scanner(System.in);

    // Creating object of EmployeeMethods
    EmployeeMethods employeeMethodobj = new EmployeeMethods();

    private JLabel basicPay_label, da_label, hra_label, cca_label;
    private JLabel gross_label, lic_label, hi_label, pf_label;
    private JLabel deduction_label, netSalary_label, loanStatus_label;

    private JTextField tf_basicPay, tf_da, tf_hra, tf_cca;
    private JTextField tf_hi, tf_pf, tf_lic, tf_gross;
    private JTextField tf_deduction, tf_netSalary, tf_loanStatus;

    private JButton grossButton, deductionButton, netSalaryButton;

    String empName, empId;

    // Class-level variable
    int empBasicPay = 0;

    // Class-level loan object
    Loanamount loanobj;

    Employee_details()
    {
        setLayout(new FlowLayout());

        payslip_Txtfldhld handler = new payslip_Txtfldhld();

        basicPay_label = new JLabel("Enter your basic pay");
        add(basicPay_label);

        tf_basicPay = new JTextField(15);
        add(tf_basicPay);
        tf_basicPay.addActionListener(handler);


        da_label = new JLabel("Your Dearness Allowance :");
        add(da_label);

        tf_da = new JTextField(15);
        add(tf_da);
        tf_da.addActionListener(handler);


        hra_label = new JLabel("Your House Rent Allowance:");
        add(hra_label);

        tf_hra = new JTextField(15);
        add(tf_hra);
        tf_hra.addActionListener(handler);


        cca_label = new JLabel("Your Compensatory Allowance :");
        add(cca_label);

        tf_cca = new JTextField(15);
        add(tf_cca);
        tf_cca.addActionListener(handler);


        gross_label = new JLabel("Your Gross Salary :");
        add(gross_label);

        tf_gross = new JTextField(15);
        add(tf_gross);
        tf_gross.setEnabled(false);

        grossButton = new JButton("Gross Salary");
        add(grossButton);
        grossButton.addActionListener(handler);


        lic_label = new JLabel("Your Life Insurance Company [LIC] :");
        add(lic_label);

        tf_lic = new JTextField(15);
        add(tf_lic);
        tf_lic.addActionListener(handler);


        hi_label = new JLabel("Your Health Insurance [HI]:");
        add(hi_label);

        tf_hi = new JTextField(15);
        add(tf_hi);
        tf_hi.addActionListener(handler);


        // FIX: initialize tf_loanStatus
        loanStatus_label = new JLabel("DO YOU HAVE LOAN :");
        add(loanStatus_label);

        tf_loanStatus = new JTextField(15);
        add(tf_loanStatus);
        tf_loanStatus.addActionListener(handler);


        pf_label = new JLabel("Your Provident Fund [PF]:");
        add(pf_label);

        tf_pf = new JTextField(15);
        add(tf_pf);
        tf_pf.addActionListener(handler);


        deduction_label = new JLabel("Your Calculated Deduction Amount :");
        add(deduction_label);

        tf_deduction = new JTextField(15);
        add(tf_deduction);
        tf_deduction.setEnabled(false);

        deductionButton = new JButton("Deduction");
        add(deductionButton);
        deductionButton.addActionListener(handler);


        netSalary_label = new JLabel("Your Net Salary Amount:");
        add(netSalary_label);

        tf_netSalary = new JTextField(15);
        add(tf_netSalary);
        tf_netSalary.setEnabled(false);

        netSalaryButton = new JButton("Net Salary");
        add(netSalaryButton);
        netSalaryButton.addActionListener(handler);

    } // constructor ends


    // ==================================================
    // Event Handler
    // ==================================================

    private class payslip_Txtfldhld implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            String str_basicPay = "";
            String str_loanStatus = "";

            char loanStatus;

            // ==========================================
            // Basic Pay
            // ==========================================

            if(event.getSource() == tf_basicPay)
            {
                str_basicPay = event.getActionCommand();

                // IMPORTANT:
                // No local empBasicPay here.
                // We are updating the class variable.
                empBasicPay = Integer.parseInt(str_basicPay);

                tf_basicPay.setText(Integer.toString(empBasicPay));
            }


            // ==========================================
            // Gross Salary
            // ==========================================

            if(event.getSource() == grossButton)
            {
                int empGrossSalary =
                    employeeMethodobj.grossSalary(empBasicPay);

                tf_hra.setText(
                    Integer.toString(employeeMethodobj.hra)
                );

                tf_da.setText(
                    Integer.toString(employeeMethodobj.da)
                );

                tf_cca.setText(
                    Integer.toString(employeeMethodobj.cca)
                );

                tf_gross.setText(
                    Integer.toString(empGrossSalary)
                );
            }


            // ==========================================
            // Loan Status
            // ==========================================

            if(event.getSource() == tf_loanStatus)
            {
                str_loanStatus = event.getActionCommand();

                loanStatus = str_loanStatus.charAt(0);

                if(loanStatus == 'y' || loanStatus == 'Y')
                {
                    // Create Loanamount object
                    loanobj = new Loanamount();

                    // Display Loanamount window
                    loanobj.setDefaultCloseOperation(
                        JFrame.DISPOSE_ON_CLOSE
                    );

                    loanobj.setSize(300, 200);
                    loanobj.setVisible(true);
                }
            }


            // ==========================================
            // Deduction
            // ==========================================

            if(event.getSource() == deductionButton)
            {
                int empDeduction =
                    employeeMethodobj.deductions(empBasicPay);

                tf_lic.setText(
                    Integer.toString(employeeMethodobj.lic)
                );

                tf_hi.setText(
                    Integer.toString(employeeMethodobj.hi)
                );

                tf_pf.setText(
                    Integer.toString(employeeMethodobj.pf)
                );

                tf_deduction.setText(
                    Integer.toString(empDeduction)
                );
            }


            // ==========================================
            // Net Salary
            // ==========================================

            if(event.getSource() == netSalaryButton)
            {
                int empNetSalary =
                    employeeMethodobj.netSalary(empBasicPay);

                tf_netSalary.setText(
                    Integer.toString(empNetSalary)
                );
            }

        } // actionPerformed ends

    } // payslip_Txtfldhld ends

} // Employee_details ends



// ======================================================
// Loanamount
// ======================================================

class Loanamount extends JFrame
{
    int empLoanAmount = 0;

    // IMPORTANT:
    // These must be class variables because
    // they are used when Calculate button is pressed.
    int loanAmt = 0;
    int Interest = 0;

    private JLabel label_loan, label_interest;

    private JTextField tf_loanamount;
    private JTextField tf_interest;
    private JTextField tf_monthlydue;

    private JButton calcButton;


    Loanamount()
    {
        // FIX: use FlowLayout
        setLayout(new FlowLayout());

        LoanCalculation loanHandler =
            new LoanCalculation();


        label_loan =
            new JLabel("Enter your total loan Amount :");

        add(label_loan);

        tf_loanamount =
            new JTextField(10);

        add(tf_loanamount);

        tf_loanamount.addActionListener(
            loanHandler
        );


        label_interest =
            new JLabel("Enter your Interest :");

        add(label_interest);

        tf_interest =
            new JTextField(10);

        add(tf_interest);

        tf_interest.addActionListener(
            loanHandler
        );


        tf_monthlydue =
            new JTextField(10);

        add(tf_monthlydue);

        tf_monthlydue.setEnabled(false);


        calcButton =
            new JButton("Calculate");

        add(calcButton);

        calcButton.addActionListener(
            loanHandler
        );

    } // Loanamount constructor ends


    // ==================================================
    // Getter for empLoanAmount
    // ==================================================

    public int getEmpLoanAmount()
    {
        return empLoanAmount;
    }


    // ==================================================
    // LoanCalculation
    // ==================================================

    private class LoanCalculation implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {

            if(event.getSource() == tf_loanamount)
            {
                loanAmt =
                    Integer.parseInt(
                        event.getActionCommand()
                    );
            }


            if(event.getSource() == tf_interest)
            {
                Interest =
                    Integer.parseInt(
                        event.getActionCommand()
                    );
            }


            if(event.getSource() == calcButton)
            {
                empLoanAmount =
                    loanAmt * Interest / 100;

                tf_monthlydue.setText(
                    Integer.toString(empLoanAmount)
                );
            }

        } // actionPerformed ends

    } // LoanCalculation ends

} // Loanamount ends



// ======================================================
// Main Class
// ======================================================

public class summa
{
    public static void main(String args[])
    {
        Employee_details empobj =
            new Employee_details();

        empobj.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE
        );

        empobj.setSize(300, 500);

        empobj.setVisible(true);
    }
}


/**private JLabel  basicPay_label,da_label,hra_label,cca_label,gross_label,lic_label,hi_label,pf_label,deduction_label,netSalary_label;
private JTextField tf_basicPay,tf_da,tf_hra,tf_cca,tf_hi,tf_pf,tf_lic,tf_gross,tf_deduction,tf_netSalary;
private JButton grossButton,deductionButton,netSalaryButton;

class classname extends JFrame 
constructor()
{
	setLayout new(FlowLayout());
	
	
	//someclass class obj=new someclass(handler);//handler for this class layyput data members
	
	basicPay_label=new JLabel("Enter your basic pay");
	add(basicPay_label);
	tf_basicPay=new JTextField(15);
	add(tf_basicPay);  //setText that user action command 
	tf_basicPay.addActionListener(handler);

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
	
	///
	lic_label=new JLabel("Your Life Insurance Company [lic] :");
	add(lic_label);
	tf_lic=new JTextField(15);
	add(tf_lic);  //setText is calculated  
	tf_licaddActionListener(handler);
	
	
	hi_label=new JLabel("Your Health Insurance [HI]:");
	add(hi_label);
	tf_hi=new JTextField(15);
	add(tf_hi);  //setText is calculated  
	tf_hi.addActionListener(handler);
	
	
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
	
	netSalary_label=new JLabel("Your netSalary Amouny:");
	add(netSalary_label);
	tf_netSalary=new JTextField(15);
	add(tf_netSalary);  //setText is calculated  
	tf_netSalary.addActionListener(handler);
	tf_netSalary.setEnabled(false);//  user cannot allows to access(just used to display results)
	
	
	netSalaryButton=new JButton("Net Salary");
	add(netSalaryButton);
    netSalaryButton.addActionListener(handler);
	
}

private class Payslip implements ActionListener
{
	public void actionPerformed(Actionevent event)
	{
		String str_basicPay="";
		int basicPay=0;
		if(event.getsource()==tf_basicPay)
		{
			str_basicPay=event.getActionCommand();   // get action command as string 
			basicPay=Integer.parseInt(str_basicPay); // convert that string into integer(primitive)
			tf_basicPay.setText(basicPay);
		}
		if(event.getSource()==grossButton)//calculation has to occurs
		{
			
			
			
		
			
	}
	
	
	
	 
	 /** void payslip()//to print the slip
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
	**/
	 
	 
	 
	 /*
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
	*/
	