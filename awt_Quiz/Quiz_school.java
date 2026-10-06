interface quiz_Iterface()
{
	public int[] randomQuestion() ;//Random Number 
	public String[] questions(int[] randomarr);//5 Questions 
	
}
import java.util.Scanner;
import java.Math.Random;
import javax.swing;
import java.awt.event.*;
class Quiz extends JFrame implements quiz_Iterface
{
	private Jlabel stuName_Label,stuId_Label,stuGrade_Label;
	private JTextField stuName_TextField,stuId_TextField,stuGrade_TextField;
	
	//Question
	private JLabel Q1Label,Q2Label,Q3Label,Q4Label,Q5Label;
	private JTextField Q1_TextField,Q2_TextField,Q3_TextField,Q4_TextField,Q5_TextField;
	
	private JRadioButton 
	private ButtonGroup grp1,grp2,grp3,grp4,grp5;//5 Group of radio button for 5 Questions 
	private JButton submitButton;
	
	String[] Questionarr=new String[5];
	Questionarr=
	
	Quiz(String stuName,String stuId,int stuGrade)
	{
		super("Quiz");
		this.stuName=stuName;
		this.stuId=stuId;
		this.stuGrade=stuGrade;
		
		stuName_Label=new Jlabel("Student Name :");
		add(stuName_Label);
		stuName_TextField =new JTextField(20);
		stuName_TextField.setText(stuName);
		
		stuId_Label=new Jlabel("Student Identity Number :");
		add(stuId_Label);
		stuId_TextField =new JTextField(10);
		stuId_TextField.setText(stuId);
		
		stuGrade_Label=new Jlabel("Student Grade :");
		add(stuGrade_Label);
		stuGrade_TextField =new JTextField(20);
		stuGrade_TextField.setText(stuGrade);
		
		Q1Label=new JLabel("Question 1:");
		add(Q1Label);
		Q1_TextField=new JTextField(50);
		Q1_TextField.setText(Question[0]);
		
		Q2Label=new JLabel("Question 2:");
		add(Q2Label);
		Q2_TextField=new JTextField(50);
		Q2_TextField.setText(Question[1]);
		
		Q3Label=new JLabel("Question 3:");
		add(Q3Label);
		Q3_TextField=new JTextField(50);
		Q3_TextField.setText(Question[2]);
		
		Q4Label=new JLabel("Question 4:");
		add(Q4Label);
		Q4_TextField=new JTextField(50);
		Q4_TextField.setText(Question[3]);
		
		Q5Label=new JLabel("Question 5:");
		add(Q5Label);
		Q5_TextField=new JTextField(50);
		Q5_TextField.setText(Question[4]);

	}
	
	//GENERATE RANDOM NUMBER OF ARRAY QUESTIONS 
	public int[] randomQuestion()  // To Return the Array of Random numbers
	{
		int[] randomarray=new int[5];
		for(int i=0;i<randomarray.length;i++)
		{
			randomarray[i]=(int)(Math.Random()*5)+1; //+1 because of no number has to be 0(zero)
		}
		return randomarray;
	}
	
	//GENERATE QUESTION ARRAY
	public String[] questions(int[] randomarr)
	{
		String[] questionArray=new String[15];
		
		
		questionArray[]={{"What is the capital of India?"},{"Which is the largest planet in our Solar System?"},{"Who is known as the Father of the Indian Constitution?"},{"Which is the longest river in India?"},{"How many continents are there in the world?"},{"Which gas do plants absorb from the atmosphere?"},{"Who was the first person to walk on the Moon?"},{"Which is the largest ocean in the world?"},{"What is the national animal of India?"},{"Which planet is known as the Red Planet?"},{"Which is the smallest country in the world?"},{"Who wrote the Indian national anthem?"},{"Which is the hardest natural substance?"},{"How many players are there in a cricket team?"},{"Which organ pumps blood throughout the human body?"}};
		
		for(int i=0; i<5; i++)
		{
			String[] quizQuestion=new String[];
			if(randomarr[i]==questionArray[i])//
			{
				quizQuestion[i]=questionArray[i+1];
			}
		}
		
     return questionArray;
	}
    
    