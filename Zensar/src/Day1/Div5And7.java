package Day1;

import java.util.Scanner;

public class Div5And7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the no is =");
		int no1=sc.nextInt();
		if(no1%5==0)
		{
			System.out.println("the no is divsisble by 5");
		}
		else if (no1%7==0)
		{
			System.out.println("the no is divsible by 7");
		}
		else
		{
			System.out.println("the no is not divsible by 5&7");
		}
	}

}
