import java.awt.FlowLayout;//absttract window toolkit
import javax.swing.*;//JFrame,JLabel,JImage

class label extends JFrame
{
	private JLabel lb1,lb2,lb3;  //JLabel is name of the Class
	public label()
	{
		super("label");
		setLayout(new FlowLayout());
		lb1=new JLabel("Enter Number");
		lb1.setToolTipText("Enter Numbers only");
		add(lb1);
		
		lb2=new JLabel();
		lb2.setText("Enter String: ");
		lb2.setHorizontalTextPosition(SwingConstants.RIGHT);
		lb2.setVerticalTextPosition(SwingConstants.TOP);
		lb2.setToolTipText("Enter String only");
		add(lb2);
		
		lb3=new JLabel("Enter Character");
		lb3.setToolTipText("Enter character only");
		add(lb3);

		
	}
	public static void main(String args[])
	{
		label labelobj1=new label();
		labelobj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		labelobj1.setSize(354,350);//width and height//Size of the window 
		labelobj1.setVisible(true);//Make it visible to the user
		
	}
	
}
