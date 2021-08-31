package Day1;

import java.util.Scanner;

public class ForLoop3And4 {
	public static void main(String[]args)
	{
	for(int i=1;i<=30;i++)
	{
		if(i%2==0||i%3==0)
		{
			System.out.println(i);
		}
	}
	
	int sum=0;
	int avg=0;
	for(int i=2;i<=10;i=i+2)
	{
		sum=sum+i;
	}
	avg=sum/10;
	System.out.println("avg="+avg);

	//seriess 1,3,7,15,................
	int t=0;
	for(int i=0;i<=5;i++)
	{
		//int t=0;
		t=t*2+1;
		System.out.println(t);
	}
	// Factorial no 
	Scanner sc= new Scanner (System.in);
	int no=sc.nextInt();
	int fact=1;
	
	for(int i=1;i<=no;i++)
	{
		fact=fact*i;
		System.out.println(fact);
	}
	System.out.println(fact);
	
	// factorial seriesss....................
	
	
	
	
	
	
	
	// digit separete form no
	System.out.println("enter the no digit");
	int no1=sc.nextInt();
	int sep=0;
	int add=0;
	for(int i=1;i<=no1;no1=no1/10)
	{
		sep=no1%10;
		add=add+sep;
	}
	System.out.println("add ="+add);
	
	// digit separete karke max find karna
	System.out.println("enter the no to find max");
	int no2=sc.nextInt();
	int sepa=0;
	int max=0;
	int temp=0;
	for(int i=1;i<=no2;no2=no2/10)
	{
		sepa=no2%10;
		if(max>sepa)
			max=temp;
		System.out.println("max="+temp);
	}
	//System.out.println("max="+temp);
	
	
	
	
	
	
	
	}
	
	
}