package comp;

public class Stock {
public int stock(int input1,int input2[])
{
	int sum=0;	
	return sum;	
}
//57093
public static void main(String[] args) {

	int arr[]= {-39957,-17136,35466,21820,-26711};
	int max=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		int sum=0;
		for(int j=i+1;j<i;j++)
		{
			sum=sum+arr[j];
			
			//System.out.println(sum);
			if(max<sum)
			{
				max=sum;
			}
		}
	}
	System.out.println(max);
	
}
}
