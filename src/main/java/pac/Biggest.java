package pac;
//Biggest of 3 numbers
//a compare with b and c
//b compared with a and c
//c compared with a and b
public class Biggest {
public static void main(String[] args) {
	int a=25,b=20,c=30;
	if(a>b)//checks a is greater than b
	{
		if(a>c)
		{
			System.out.println("A is bigger");
		}
		else
		{
			System.out.println("C is bigger");
		}
	}
	else
	{
		if(b>c)//checks b is greater than c
		{
			System.out.println("B is bigger");
		}
		else
		{
			System.out.println("c is bigger");
		}
	}
}
}
