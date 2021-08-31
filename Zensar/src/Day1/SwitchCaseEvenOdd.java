package Day1;

import java.util.Scanner;

public class SwitchCaseEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the no1");
		int no1=sc.nextInt();
		int sum=no1%2;
		switch(sum)
		{
		case 0:
			System.out.println("its even");
			break;
		case 1:
			System.out.println("its odd");
			break;
		}
	}

}
