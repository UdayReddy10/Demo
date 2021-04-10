package oops;

public class Employ {
int empId;
String empName;
double empSal;
Employ()
{
	
}
public Employ(int empId, String empName, double empSal)
{
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSal = empSal;
}
@Override
public String toString() {
	return "Employ [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
}
public static void main(String[] args) {
	Employ e1=new Employ();
	System.out.println(e1.toString());
	Employ e2=new Employ(123, "Ram", 15000);
	System.out.println(e2);
	Employ e3=new Employ(124, "Sam", 19500);
	System.out.println(e3);
	
}

}
