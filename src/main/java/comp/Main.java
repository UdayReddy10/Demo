package comp;

import java.util.Scanner;

public class Main {
	public static String TimeConvert(int num)
	{
		String startTime = "00:00";
		int h = num / 60 + Integer.parseInt(startTime.substring(0,1));
		int m = num % 60 + Integer.parseInt(startTime.substring(3,4));
		String newtime = h+":"+m;
		return newtime;
		}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.print(TimeConvert(s.nextInt()));
}
}
