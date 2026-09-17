import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
class register extends JFrame
{
	int n1=0,n2=0,count=0;
	private JLabel num1,num2;
	private JTextField tf1,tf2;
	
	public register()
	{
		super("register");
		setLayout(new FlowLayout());
		num1=new JLabel("Enter your Number 1");
		add(num1);
		tf1=new JTextField(20);
		add(tf1);
		
		 txtfldhld handler=new txtfldhld();   
		 tf1.addActionListener(handler);
		 
		num2=new JLabel("Enter your number2 ");
		add(num2);
		tf2 = new JTextField(20);
        add(tf2);
		tf2.addActionListener(handler);
	
	}
	private class txtfldhld implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String str1="",str2="";
			count++;
			if(event.getSource()==tf1)
			{
				str1=event.getActionCommand();// Get an user typed value as an string 
				n1=Integer.parseInt(str1);  //convert that parseInt to (string to int)
			}
			if(event.getSource()==tf2)
			{
				str2=event.getActionCommand();
				n2=Integer.parseInt(str2);
			}
			if(count>1)
			  JOptionPane.showMessageDialog(null,"Sum is "+Integer.toString(n1+n2));//showMessageDialog is used to display the answer in format
		}
	}

}//class ends

public class addition
{
	public static void main(String args[])
	{
		register regobj=new register();
		regobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		regobj.setSize(200,354);
		regobj.setVisible(true);
	}
}

