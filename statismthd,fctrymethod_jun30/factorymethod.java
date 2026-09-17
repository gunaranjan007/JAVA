class Teacher
{
	int  group;
	static String group_name="";
	private String groupname="";
	static Teacher createteacher(int group)//Return type here is Teacher 
	{
		if(group==1)
			group_name="Maths&biology";
		else if (group==2)
			group_name="Computer Science";  //factory method - to change the data members to uor our desired type 
		else if(group==3)
			group_name="Arts";

	return new Teacher (group_name );// new - because of create an constructor for that object
	}
	private Teacher(String groupname)//constructor 
	{
		this.groupname=groupname;
		System.out.print(groupname);
	}
	
}//class teacher ends
public class factorymethod
{
	public static void main(String args[])
	{
		Teacher stu1=Teacher.createteacher(1);
		Teacher stu2=Teacher.createteacher(2);
		
	}
}//public class ends
