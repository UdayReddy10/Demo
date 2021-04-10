package Deloitte;

import java.util.Arrays;
import java.util.Scanner;

public class MaxRevenue_2Darray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < col - j - 1; k++) {
                    if (arr[i][k] > arr[i][k + 1]) {
                        int t = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = t;
                    }
                }
            }
		}
		for(int i=0;i<row;i++)
		{
				System.out.print(arr[i][col-1]+" ");
		}
		}
}
