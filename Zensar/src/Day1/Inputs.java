package Day1;

import java.util.Scanner;
public class Inputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the three no");
		int no1=sc.nextInt();
		byte no2=sc.nextByte();
		short no3=sc.nextShort();
		
		System.out.println("add="+(no1+no2+no3));
		System.out.println("the h");
		float h=sc.nextFloat();
		System.out.println("enter the m/f");
		char gender=sc.next().charAt(0);
		String name= sc.next();
		System.out.println("the name is "+name);                
		}

}
