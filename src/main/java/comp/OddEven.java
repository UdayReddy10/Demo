package comp;

import java.util.Scanner;

public class OddEven {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int arr[]=new int[size];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	int res[]=new int[size];	int j=0;
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]%2==0)
		{
			res[j]=arr[i];
			j++;
		}}
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]%2!=0)
		{
			res[j]=arr[i];
			j++;
		}}
	for (int i = 0; i < res.length; i++) {
		System.out.print(res[i]+" ");	
	}}}
