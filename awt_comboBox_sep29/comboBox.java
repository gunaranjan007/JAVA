import java.awt.event.*;
import javax.swing.*;
class ComboBox implements ActionListener//Combination Box
{
	JFrame jf;
	private JLabel label_Item;
	private JButton button_select;
	private JComboBox jcb;
	 ComboBox()
	 {
		 jf=new JFrame();
		 label_Item=new JLabel("Select any One option :");
		 label_Item.setBounds(50, 50, 180, 30);
		 
		 button_select=new JButton("SELECT");
		 button_select.setBounds(50, 190, 180, 35);
		 
		 String[] item={"IDLI","PONGAL","DOSA","SAMOSA","VADA","BAJJI","POORI","CHAPATHI","IDIYAPPAM","BONDA"};
		 
		 jcb=new JComboBox(item);
		 jcb.setBounds(50, 140, 180, 35);
		 
		 jf.add(label_Item);
		 jf.add(jcb);
		 jf.add(button_select);
		 
		 jf.setLayout(null);
		 jf.setSize(400,500);
		 jf.setVisible(true);
		 button_select.addActionListener(this);
		 
	 } 
	    public void actionPerformed(ActionEvent event)
		{
			if(event.getSource()==button_select)
			{
				String getItem=""+jcb.getItemAt(jcb.getSelectedIndex());
				//
			JOptionPane.showMessageDialog(null,getItem);
		
			}		
		}

	 public static void main(String args[])
	 {
		ComboBox comboobj=new ComboBox();
		
	 }
}
	 
	 
	 
	
