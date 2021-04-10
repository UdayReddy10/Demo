package oops;

public class Son extends Father {
	void mrg(String girl)
	{
		System.out.println("Love Marriage");
	}
	void dowry()
	{
		System.out.println("No dowry");
	}
	void friends()
	{
		System.out.println("Bachelorate party in Goa");
	}
	public static void main(String[] args) {
		Son s=new Son();
		s.mrg("Ramya");
		s.dowry();
		s.friends();
		s.relations();
		//Upcasting
		Father f=new Son();
		f.mrg("Samantha");
		f.dowry();
		f.relations();
	}
}
