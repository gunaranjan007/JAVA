import java.awt.event.*;
import javax.swing.*;
import java.awt.FlowLayout;
class Calculator extends JFrame
{
	private int num1,num2; //formal number used in private class
	private JLabel label_num1,label_num2,answer;
	private JTextField tf1,tf2 ,tf3;//tf3 is disabled to show only an answer
	private JButton addbutton,subbutton,mulbutton,divbutton,modbutton,ansbutton;//6 Buttons
	
	public Calculator()//constructor
	{
		super("Calculator");
		setLayout(new FlowLayout());
		txtfldhld handler = new txtfldhld();//creating an object -handler
	
		label_num1=new JLabel("Enter the Number 1:");
		add(label_num1); //Adding the Label in the Frame 

		
		tf1=new JTextField(10);//10 is the size of the Textfield
		add(tf1);
		tf1.addActionListener(handler);
		

		label_num2=new JLabel("Enter the Number 2:");
		add(label_num2); //Adding the Label in the Frame 

		
		tf2=new JTextField(10);//10 is the size of the Textfield
		add(tf2);
		tf2.addActionListener(handler);

		answer=new JLabel("Answer");
		add(answer);
		tf3=new JTextField(10);  // Only for Displaying Answer (no need for actionlistener)
		add(tf3);
		tf3.setEnabled(false);//No access by user
		
		
		addbutton=new JButton();
		add(addbutton);
		addbutton.setText("+");
		addbutton.addActionListener(handler);
		
		subbutton=new JButton();
		add(subbutton);
		subbutton.setText("-");
		subbutton.addActionListener(handler);
		
		mulbutton=new JButton();
		add(mulbutton);
		mulbutton.setText("*");
		mulbutton.addActionListener(handler);
		
		divbutton=new JButton();
		add(divbutton);
		divbutton.setText("/");
		divbutton.addActionListener(handler);
		
		modbutton=new JButton();
		add(modbutton);
		modbutton.setText("%");
	    modbutton.addActionListener(handler);
		
	}//constructor ends
	private class txtfldhld implements ActionListener// class is created to Handle the Text Field 
	{
		public void actionPerformed(ActionEvent event)
		{
			String string_num1="",string_num2="";
			if(event.getSource()==tf1)
			{
				string_num1=event.getActionCommand();
				num1=Integer.parseInt(string_num1);
			}
			if(event.getSource()==tf2)
			{
				string_num2=event.getActionCommand();
				num2=Integer.parseInt(string_num2);
			}
			if(event.getSource()==addbutton)
			{
				tf3.setText(Integer.toString(num1+num2));// set that text to display the Answer
			}
			if(event.getSource()==subbutton)
			{
				tf3.setText(Integer.toString(num1-num2));
			}
			if(event.getSource()==mulbutton)
			{
				tf3.setText(Integer.toString(num1*num2));
			}
			if(event.getSource()==divbutton && (num1>0) && (num2>0))
			{
				tf3.setText(Integer.toString(num1/num2));
			}
			if(event.getSource()==modbutton)
			{
				tf3.setText(Integer.toString(num1%num2));
			}
		}
	}
}
public class Calculator_layout
{
	public static void main(String args[])
	{
		Calculator calc_obj=new Calculator();
		calc_obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calc_obj.setSize(300,256);
		calc_obj.setVisible(true);
	}
}