package predefined;

public class Employ {
String empName;
int empId;
public Employ(String empName, int empId) {
	super();
	this.empName = empName;
	this.empId = empId;
}
@Override
public String toString() {
	return "empName=" + empName + ", empId=" + empId ;
}

}
