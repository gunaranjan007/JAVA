class Student
{
	
	private int mark;//encapsulated 
	private String name;
  Student(String name,int mark)
  {
	  this.name=name;
	  this.mark=mark;
  }
  public int markconversion()
  {
	  int totalmark=0;
	  totalmark=mark+40;
	  
	return(totalmark);
  }
  public static void lastfunc(Student stu1,Student stu2)
  {
	  int first=stu1.markconversion();
	  int second =stu2.markconversion();
	  
	  if(first>second)
		  System.out.print(stu1.name+" is winner");
	  else if (second>first)
		  System.out.print(stu2.name+" is winner");
	  else
		  System.out.print(stu1.name+" and "+stu2.name+" both are winners ");
  }//lastfunc ends
}
public class studentprogress
{
	public static void main (String args[])
	{
		Student stu1=new Student("guna",56);
		Student stu2=new Student("nayarayan",54);
		Student.lastfunc(stu1,stu2);
		
	}
}
		