package oops;

public class Student {
static String college="SVCE";
int stuId;
String stuName;
String stuDept;
Student() //zero argumented 
{
	System.out.println("Assigned the default values");
}
Student(int stuId,String stuName,String stuDept)
{
	System.out.println("Assigning user defined values");
	this.stuId=stuId;
	this.stuName=stuName;
	this.stuDept=stuDept;
}
void display()
{
	System.out.println("College Name==>"+college);
	System.out.println("Student Name==>"+stuName);
	System.out.println("Student Id==>"+stuId);
	System.out.println("Student Dept==>"+stuDept);
}
public static void main(String[] args) {
	Student s1=new Student();
	s1.display();
	Student s2=new Student(11, "Ram", "Cse");
	s2.display();
	Student s3=new Student(12, "Sam", "Cse");
	s3.display();
	Student s4=new Student(13,"Anu","It");
	s4.display();
	//Student s5=new Student(id, name, dept);
}
}
