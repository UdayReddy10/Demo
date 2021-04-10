package pac;

public class Pattern1 {
public static void main(String[] args) {
	int num=1;
	for(int row=1;row<=5;row++)
	{
		for(int col=5;col>=1;col--)
		{
			if(row>=col)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();	
	}
}
}
