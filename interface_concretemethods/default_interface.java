
interface extra_class
{
	default public int class_timing(int grade,int totalMark)//default concrete class
	{
		int extra_classtime=0;
		if((grade==10) && (totalMark<450))
			extra_classtime=40;
		else if((grade>10) && (totalMark<550))
			extra_classtime=60;
	return(extra_classtime);
	}
}

class coaching_class10 implements extra_class
{
	String stuName;
	int grade=0, totalMark=0;
	coaching_class10(String stuName,int grade,int totalMark)
	{
		this.stuName=stuName;
		this.grade=grade;
		this.totalMark=totalMark;
	}
	public void display()
	{
		int timing=class_timing(grade,totalMark);
		System.out.println("You have to come "+timing+" minutes earlier");
	}
}//class coaching_class10 ends

class coaching_class12 extends coaching_class10 implements extra_class//single inheritance 
{
	coaching_class12(String stuName,int grade,int totalMark)
	{
		super(stuName,grade,totalMark);
	}
	@Override public int class_timing(int grade, int totalMark)
	{
		int grade12_timing=0;
		if(grade==12)
		{
			if(totalMark>400)
				grade12_timing=60;
			else if(totalMark>500)
				grade12_timing=90;
			else 
				grade12_timing=120;
		}
	return(grade12_timing);
	}
}//class coaching_class12 ends

public class default_interface
{
	public static void main(String args[])
	{
		coaching_class10 stu1=new coaching_class10("guna",10,463);
		stu1.display();
		
		coaching_class12 stu2=new coaching_class12("sam",12,556);
		int timing=stu2.class_timing(12,556);
		System.out.print("You have to come "+timing+"minutes earlier");
	}
}//public class ends
		
		
	
		
			
			
			
		