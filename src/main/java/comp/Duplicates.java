package comp;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicates {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int arr[]=new int[size];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();	
	}
	Set s=new LinkedHashSet();
	for (int i = 0; i < arr.length; i++) {
		s.add(arr[i]);
	}
	System.out.println(s);
}
}
