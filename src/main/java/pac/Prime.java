package pac;
//Prime-->num which is divisible by 1 and itself
//5-->2,3,4
//13->2,3,4,5,6,7,8,9,10,11,12
public class Prime {
public static void main(String[] args) {
	int counter=0;
	for(int num=2;num<=1000;num++)
	{
	int count=0;
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			count++;
			break;
		}
	}
	if(count==0)
	{
		counter++;
	}	
}	
	System.out.println(counter);
}
}
