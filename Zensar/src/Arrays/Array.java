package Arrays;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the array");
		int [] a=new int[6];
		for(int i=0;i<a.length-1;i++)
				{
					a[i]=sc.nextInt();
				}
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println("str="+a[i]);
		}
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println("reverse="+a[i]);
		}
				
	
	}

}
