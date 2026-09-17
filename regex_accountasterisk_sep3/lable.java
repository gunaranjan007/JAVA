import java.awt.FlowLayout;
import javax.swing.*;

class label extends JFrame
{
	private JLabel lb1,lb2,lb3;
	public label()
	{
		super("label");
		setLayout (new FlowLayout());
		lb1=new JLabel("Enter Number");
		lb1.setToolTipText("Enter Numbers only");
		add(lb1);
	}
	public static void main(String args[])
	{
		label labelobj=new label();
		labelobj.setDefaultCloseOpertaion();
		JFrame.EXITONCLOSE();
		
		labelobj.setSize(354);
		labelobj.setVisible(true);
		
	}
	
	
}