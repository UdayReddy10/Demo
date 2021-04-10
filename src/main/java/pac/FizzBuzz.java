package pac;

public class FizzBuzz {
public static void main(String[] args) {
	int num=15;
	if(num%3==0 && num%5!=0)
	{
		System.out.println("Fizz");
	}
	else if(num%5==0 && num%3!=0)
	{
		System.out.println("Buzz");
	}
	else if(num%3==0 && num%5==0)
	{
		System.out.println("FIzzBuzz");
	}
	else
	{
		System.out.println(num);
	}
}
}
