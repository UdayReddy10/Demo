package oops;

import java.io.*;


public class Test {
public static void main(int i) {
	System.out.println("main method with 1 int arg");
	}
public static void main(int i,int j) {
	System.out.println("main method with 2 int arg");
}

public static void main(String[] args) {
	main(10);
	main(10, 20);
	}
}
