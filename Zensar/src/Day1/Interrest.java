package Day1;

import java.util.Scanner;

public class Interrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the Intial balnce");
		int p=sc.nextInt();
		System.out.println("enter the anual rate");
		int r=sc.nextInt();
		System.out.println("enter the time");
		float t=sc.nextFloat();
		float simpleInterest=0;
		simpleInterest=(p*r*t/100);
		System.out.println("the simple interrest is ="+simpleInterest);
		}

}
