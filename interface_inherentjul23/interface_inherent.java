interface extraclass
{
	public static final int time=30;//data members //constants 
	public int extraclass_timing(int grade);
}
interface badge extends extraclass//inheritance of interface 
{
	public void badge_eligibility(int totalMark);//abstract class 
}
class School implements badge
{
	String name;
	int grade=0,mark=0;
	School(String name ,int grade,int mark)//constructor 
	{
		this.name=name;
		this.grade=grade;
		this.mark=mark;
	}
	@Override public int extraclass_timing(int grade)//concrete method 
	{
	    int timing=0;
		if((grade>=10) && (grade<=12))
		{
			timing=time;//from inerface extraclass datamembers 
		}
		return(timing);
	}
	@Override public void badge_eligibility(int totalMark)//concrete method
	{
		if (totalMark>=450)
			System.out.print("You are eligible to get an badge ");
		else 
			System.out.print("You are not eligible to get an badge ");
	}
}//class School ends
public class interface_inherent
{
	public static void main(String args[])
	{
		School stu1=new School("guna",11,465);
		System.out.println("you have to come "+stu1.extraclass_timing(11)+"mins earlier");
		stu1.badge_eligibility(465);
	}
}//public class ends
		
	

