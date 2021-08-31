package Arrays;

import java.util.Scanner;

public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr=new int [4][4];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the elements in rows"+i);
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]= sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for(int r=0;r<)
	}

}
