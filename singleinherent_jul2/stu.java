class Student_name //parent class 
{
	String name;
	protected int rollno=0;// if protected can been used this data memberds by  child class  (like Dad's Bike)
	
	Student_name(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	
}//class ends

class Student_list extends Student_name//child class 
{
	int mark1=0,mark2=0,mark3=0,totalMark=0;
	String result="";
	
	Student_list(String name,int rollno ,int mark1,int mark2,int mark3)//constructor
	{
		super(name,rollno); //calls the data members from the student_name constructor
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	
	public void markCalculation()
	{
		totalMark=mark1+mark2+mark3;
		
		if(totalMark>105)
			result="pass";
		else
			result="fail";
	}
	
	public void displaymark()
	{
		System.out.println("Name :"+name);
		System.out.println("Roll number:"+rollno);
		System.out.print("Total Mark:"+totalMark);
		System.out.print("Result :"+ result);
	}
}
		

public class stu 
{
	public static void main(String args[])
	{
		Student_list stu1= new Student_list("guna",101,56,78,98);
		Student_list stu2=new Student_list("ravi",102,92,75,44);
		
		stu1.markCalculation();
		stu1.displaymark();
	}
}//public class ends
	
	