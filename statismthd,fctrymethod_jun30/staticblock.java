class Student
{
	static String  school_name;
	private int stuId;
	private String stuName;
	static 
	{
		school_name="ksv Matric Higher Secondary School";
	}
	
	Student(String stuName,int stuId)
	{
		this.stuName=stuName;
		this.stuId=stuId;
	}
	
	public void identitycard()
	{
		System.out.println("SCHOOL NAME:"+school_name);
		System.out.println("STUDENT NAME:"+stuName);
		System.out.println("STUDENT ID:"+stuId);
	}//Identity card method ends
	
}//class Student ends

public class staticblock
{
	public static void main(String args[])
	{
		Student stu1=new Student("raj",101);
		Student stu2=new Student("ram",102);
		stu1.identitycard();
		stu2.identitycard();
	}
}//public class ends