abstract class School//abstact class has not been cu
{
	String name;
	School(String name)//Abstract class constructor 
	{
		this.name=name;	
	}
	
	abstract String Mark_calulation();//abstract method 
	
}//Abstract class ends
class Schoolmark extends School//single inheritance 
{
	int mark;
	Schoolmark(String name,int mark)//constructor 
	{
		super(name);//calls constructor of super class 
		this.mark=mark;
	}
	@Override public String Mark_calulation()//concrete overridden method 
	{
		String result;
		if(mark>35)
			result="pass";
		else
			result="fail";
	return(result);
	}
}//Schoolmark class ends
public class School_Calculation
{
	public static void main(String args[])
	{
		Schoolmark stu1=new Schoolmark("guna",67);
		System.out.println(stu1.Mark_calulation());
		System.out.println(stu1.name);
	}
}//public class ends 
		
	
		
	