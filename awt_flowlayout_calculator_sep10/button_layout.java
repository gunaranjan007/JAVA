import java.awt.*;
import javax.swing.*;
class calculator
{
	JLabel num1,num2;
	
	JButton butt1,butt2;
	
	
	
	txtfiled.setEnable(false);//put in 3 rd textfield
	
	butt1=new JButton();
	butt1.setText("");
	butt1.assActionListener(handler);
	
	
	
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
		 
		num2=new JLabel("Enter your number2 ");
		add(num2);
		tf2 = new JTextField(20);
        add(tf2);
		tf2.addActionListener(handler);
	
	}