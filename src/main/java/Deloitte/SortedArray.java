package Deloitte;

public class SortedArray {
	static int[] sortArrays(int n1,int[] A1,int n2,int[] A2)
	{
		int[] sortedArray=new int[1000];
		int size=n1+n2;
		int k=0;
		for(int i=0;i<n1;i++)
		{
			sortedArray[k]=A1[i];
			k++;
		}
		for(int i=0;i<n2;i++)
		{
			sortedArray[k]=A2[i];
			k++;
		}
		for(int i=0;i<size;i++)
		{	for(int j=i+1;j<size;j++)
			{
				if(sortedArray[i]>sortedArray[j])
				{
					int temp=sortedArray[i];
					sortedArray[i]=sortedArray[j];
					sortedArray[j]=temp;
				}
			}
		}
		return sortedArray;
	}
public static void main(String[] args) {
	
}
}
