import javax.swing.*;
import java.awt.event.*;
class CheckBox extends JFrame implements ActionListener
{
	private JCheckBox box_vada,box_puff,box_bonda,box_biscuits,box_tea,box_cofee,box_coolDrinks;
	private JLabel label_Product;
	private ButtonGroup beverage_grp,snack_grp;
	private JButton submit_Button;
	
	CheckBox()
	{
		super("CHECKBOX");
		
		label_Product =new JLabel("What are products you have taken :");
		add(label_Product);
		
		//SNACKS
		box_vada =new JCheckBox("Vada");
		box_puff=new JCheckBox("Puffs");
		box_bonda=new JCheckBox("Bonda");
		box_biscuits=new JCheckBox("Biscuits");
		
		box_vada.setBounds(100,150,200,20);
		box_puff.setBounds (100,200,200,20);
		box_bonda.setBounds (100,250,200,20);
		box_biscuits.setBounds (100,300,200,20);
		
		//BEVERAGES
		box_tea=new JCheckBox("Tea");
		box_cofee =new JCheckBox("Cofee");
		box_coolDrinks=new JCheckBox("CoolDrinks");
		
		
		box_tea.setBounds(120,150,200,20);
		box_cofee.setBounds(120,200,200,20);
		box_coolDrinks.setBounds(120,250,200,20);
	
	    //SNACKS GROUP
		snack_grp=new ButtonGroup();
		//add(snack_grp);
		
		snack_grp.add(box_vada);
		snack_grp.add(box_puff);
		snack_grp.add(box_bonda);
		snack_grp.add(box_biscuits);
		
		//BEVERAGES GROUP
		beverage_grp=new ButtonGroup();
		//add(beverage_grp);
		
		beverage_grp.add(box_tea);
		beverage_grp.add(box_cofee);
		beverage_grp.add(box_coolDrinks);
		
		//BUTTON
		submit_Button=new JButton("Submit");
		submit_Button.setBounds(100,300,80,30);
		submit_Button.addActionListener(this);
		

		add(box_vada);
		add(box_puff);
		add(box_bonda);
		add(box_biscuits);
		add(box_tea);
		add(box_cofee);
		add(box_coolDrinks);
		
		
		setVisible(true);
		setLayout(null);
        setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     	 
	}
	public void actionPerformed(ActionEvent event)
	{
			int totalPrice=0;
		if(event.getSource()==submit_Button)
		{
		
			if(box_vada.isSelected())
				totalPrice+=5;
			else if(box_puff.isSelected())
				totalPrice+=10;
			else if(box_bonda.isSelected())
				totalPrice+=8;
			else if(box_biscuits.isSelected())
				totalPrice+=6;
			else if(box_tea.isSelected())
				totalPrice+=12;
		    else if(box_cofee.isSelected())
				totalPrice+=10;
			else if(box_coolDrinks.isSelected())
				totalPrice+=15;

		}
		JOptionPane.showMessageDialog(null,Integer.toString(totalPrice));
	}
	
	
	
}
public class Checkbox_awt
{
	public static void main(String args[])
	{
		CheckBox checkobj=new CheckBox();
	}
	
	
}