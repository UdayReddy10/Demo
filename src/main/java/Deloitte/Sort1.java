package Deloitte;

import java.util.Arrays;
import java.util.Scanner;

public class Sort1 {
public static void main(String[] args) {
	int arr[]= {1,2,2,3,3};
	Sort1 s=new Sort1();
	boolean b=s.solution(arr, 1);
	System.out.println(b);
}
public boolean solution(int A[],int k)
{
	int n=A.length;
	for(int i=0;i<n-1;i++)
	{
		if(A[i]+1 < A[i+1])
		{
			return true;
		}
	}
	if(A[0]!=0 && A[n-1]!=k)
	{
		return false;
	}
	else
		return true;
}
}
