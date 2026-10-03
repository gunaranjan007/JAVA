import java.awt.*;
import javax.swing.*;
import javax.swing.ListSelectionModel ;
import javax.swing.event.ListSelectionEvent ;
import javax.swing.event.ListSelectionListener ;
class ListB extends JFrame 
{
	private JList fruitList;
	private static final String[]  arr ={"apple","mango","Grape","Orange","Guava"};
	private static final Color[]  colorName ={Color.RED,Color.YELLOW,Color.BLUE,Color.ORANGE,Color.GREEN};
	
	
	ListB()
	{
		super("ListBox");
		setLayout(new FlowLayout());
		fruitList=new JList(arr);
		fruitList.setVisibleRowCount(3);
		fruitList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(fruitList));
		
		ListHandler handler=new ListHandler();
		fruitList.addListSelectionListener(handler);
	}
	
	public class  ListHandler implements ListSelectionListener
	{
		public void valueChanged(ListSelectionEvent event)
		{
			getContentPane().setBackground(colorName[fruitList.getSelectedIndex()]);
			JOptionPane.showMessageDialog(null,fruitList.getSelectedIndex());
		}			
	}
	
}
public class ListBox
{
	public static void main(String args[])
	{
		ListB lstOBj=new ListB();

		lstOBj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lstOBj.setSize(400,300);
		lstOBj.setVisible(true);
		
	}
}
	