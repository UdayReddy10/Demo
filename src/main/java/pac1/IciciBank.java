package pac1;

public class IciciBank extends ICICI{
	void homeLoan() {
		System.out.println("9%");
	}
	void icicInsurance() {
		System.out.println("Icici insurance for all");
	}
	void personalLoan() {
System.out.println("14%");		
	}
	void carLoan() {
System.out.println("19%");		
	}
public static void main(String[] args) {
	Rbi r=new IciciBank();
	r.rules();
	r.personalLoan();
	r.carLoan();
	ICICI i=new IciciBank();
	i.rules();
	i.personalLoan();
	i.carLoan();
	i.homeLoan();
	i.icicInsurance();
}
}
