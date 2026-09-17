class Student
{
	private String name;
	private int regno,result=0;
	private int mark1,mark2,mark3;
	Student()//constructor class (no return type)
	{
		name="";
		regno=0;
		
	}
	Student(String name,int regno)
	{
		this.name=name;
		this.regno=regno;
		System.out.print("The Register Number "+regno+" is "+name);
	}
	Student(int regno,int mark1,int mark2,int mark3)//constructor class with passed parameter
	{
		this.regno=regno;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		studentresult();
		System.out.print("The Register number "+regno+" Got "+result+" mark");
		
	}
	private  int studentresult()
	{
		result=mark1+mark2+mark3;
	return(result);
	}
}
public class Studentresult
{
	public static void main(String args[])
	{
		Student guna=new Student();
		Student tom=new Student("tom",104);
		System.out.println();
		Student somu= new Student(105,56,43,78);
	}
}
		
		
		
		
		