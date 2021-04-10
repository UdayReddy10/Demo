package Deloitte;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MissingNum {
public static int missingNumber(String fileLocation) throws FileNotFoundException {
	Scanner sc = new Scanner(new File(fileLocation));  
	sc.useDelimiter(",");  
	String str="";
	while (sc.hasNext())   
	{  
	str=str+sc.next();  
	}   
	sc.close();  
	System.out.println(str);	
	String s1[]=str.split("");
	int a[]=new int[str.length()];
	for (int i = 0; i < s1.length; i++) {
		a[i]=Integer.parseInt(s1[i]);
	}
	 int i, total;
	 int n=a.length;
     total = (n + 1) * (n + 2) / 2;
     for (i = 0; i < n; i++)
     {
         total -= a[i];
     }
     return total;
}  
public static void main(String[] args) throws FileNotFoundException {
	System.out.println(missingNumber("C:\\Personal\\Comma.csv"));
}
	
	

}
