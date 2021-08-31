package Day1;

import java.util.Scanner;

public class SwitchCaseCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("the  calculator");
		System.out.println("enter the no1");
		int no1=sc.nextInt();
		System.out.println("enter the no2");
		int no2=sc.nextInt();
		System.out.println("1:add,2:sub,3:multi,4:div");
		int no=sc.nextInt();
		switch (no)
		{
		case 1:
			System.out.println ("add="+(no1+no2));
			break;
		case 2:
			System.out.println ("sub="+(no1-no2));
			break;
		case 3:
			System.out.println ("mult="+(no1*no2));
			break;
		case 4:
			System.out.println ("a"
					+ "div="+(no1+no2));
			break;
		default:
			System.out.println ("invalid");
			
		}
	}

}
