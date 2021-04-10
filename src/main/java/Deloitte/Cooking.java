package Deloitte;

public class Cooking {
public static void main(String[] args) {
	int input1=3;
	int input2[]= {-1,-9,0,5,-7};
	int j=1;
	int result=0;
	for(int i=0;i<input2.length;i++)
	{
	result=result+(j*input2[i]);
	j++;
	}
	System.out.println(result);
}
}
