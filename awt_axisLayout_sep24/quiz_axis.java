import java.awt.event.*;
import javax.swing.*;

public class quiz_axis extends JFrame implements ActionListener
{
	private JLabel label_Capital;
	private JRadioButton radio_opt1,radio_opt2,radio_opt3,radio_opt4;
	private ButtonGroup grp;
	private JButton  submit_button;
	quiz_axis()
	{
		super("Quiz");
		
		label_Capital=new JLabel("Which city  is the capital of india ?");
		label_Capital.setBounds(50,50,300,20);
		
		 radio_opt1=new JRadioButton("New delhi");
		 radio_opt2=new JRadioButton("Chennai");
		 radio_opt3=new JRadioButton("Kolkata");
		 radio_opt4=new JRadioButton("Rajasthan");
		 
		radio_opt1.setBounds(100,100,150,20);
		radio_opt2.setBounds(100,150,150,20);
		radio_opt3.setBounds(100,200,150,20);
		radio_opt4.setBounds(100,250,150,20);
		
		grp =new ButtonGroup();  //grouping the options 
		grp.add(radio_opt1);
		grp.add(radio_opt2);
		grp.add(radio_opt3);
		grp.add(radio_opt4);
		
		submit_button =new JButton("Submit");
		submit_button.setBounds(100,300,80,30);
		submit_button.addActionListener(this);
		
		
		add(label_Capital);
		add(radio_opt1);
		add(radio_opt2);
		add(radio_opt3);
		add(radio_opt4);
		add(submit_button);
		
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}	
	public void actionPerformed(ActionEvent event)
		{
			if(event.getSource()==submit_button)
			{
				if(radio_opt1.isSelected())
					JOptionPane.showMessageDialog(null,"Correct Answer");
				else if(radio_opt2.isSelected())
					JOptionPane.showMessageDialog(null,"Wrong Answer");
				else if(radio_opt3.isSelected())
					JOptionPane.showMessageDialog(null,"Wrong Answer");
				else if(radio_opt4.isSelected())
					JOptionPane.showMessageDialog(null,"Wrong Answer");
				else 
					JOptionPane.showMessageDialog(null,"Select Any Button");	
				
				radio_opt1.setSelected(false);
			radio_opt2.setSelected(false);
			radio_opt3.setSelected(false);
			radio_opt4.setSelected(false);
			}
			
			
		}
		
	public static void main(String args[])
	{
		quiz_axis quizobj=new quiz_axis();
	}
}