package comp;

public class Student {
public static void main(String[] args) {
	int arr[]= {3,4,1,5,2};
	int res[]=new int[arr.length];
	for(int i=0;i<arr.length;i++)
	{
		int count=0;
		if(i==0)
		{
			res[i]=0;
		}
		
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]>arr[i])
				count++;
			res[i]=count;
		}
		
	}
	for(int a:res)
	{
		System.out.println(a);
	}
}
}
