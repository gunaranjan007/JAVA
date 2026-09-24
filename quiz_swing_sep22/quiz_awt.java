import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class quiz extends JFrame 
{
	private JLabel Label_capital;
	//private ButtonGroup group;
	private JRadioButton opt1,opt2,opt3,opt4;
	private JButton submit_button;
	
	quiz()
	{
		
		super("Quiz");
		setLayout(new FlowLayout());
		
		//LABEL
		Label_capital=new JLabel("What is the capital of India:");
		add(Label_capital);
		
		ButtonGroup group=new ButtonGroup(); // creating an obj for an button group
		
		//OPTIONS 
		 opt1=new JRadioButton("New delhi");
		 opt2=new JRadioButton("Chennai");
		 opt3=new JRadioButton("Kolkata");
		 opt4=new JRadioButton("Rajasthan");
		
		group.add(opt1);  
		group.add(opt2);   //Adding the options in the Group 
		group.add(opt3); 
		group.add(opt4); 
		
		add(opt1);
		add(opt2);    // Adding the Options in the Layout 
		add(opt3);
		add(opt4);
		
		//opt1.addActionListener(handler);
		//opt2.addActionListener(handler);
		//opt.addActionListener(handler);
		//opt4.addActionListener(handler);		
		
		buttonHandler handler=new buttonHandler();  // Button Handler
		
		submit_button=new JButton("Submit");
		add(submit_button);
		submit_button.addActionListener(handler);
	}
		
	private class buttonHandler implements  ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource()==submit_button)
			{
				if(opt1.isSelected())
					JOptionPane.showMessageDialog(null,"your Answer is correct");
				else if (opt2.isSelected())
					JOptionPane.showMessageDialog(null," Wrong Answer ");
				else if (opt3.isSelected())
					JOptionPane.showMessageDialog(null," Wrong Answer ");
				else if (opt4.isSelected())
					JOptionPane.showMessageDialog(null," Wrong Answer ");
				else
					JOptionPane.showMessageDialog(null,"Select any Radio Buttons ");
			}
		}
	}	
}
public class quiz_awt 
{
	public static void main(String args[])
	{
		quiz quizobj=new quiz();
		quizobj.setSize(200,300);
		quizobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quizobj.setVisible(true);
	}
}
		
	
	

	