package Day1;
class A
{
	int a;
	int b;
	
	A(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void add()
	{
		int c=a+b;
		System.out.println("the add= "+c);
	}
	int multiply()
	{
		return a*b;
		
	}
	int div (){
		return a/b;
	}
	static int factorial(int n)
	{
		int fact=1;
		for(int i=0;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("fact is ="+fact);
		return fact;
		
		
	}
	}
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A(10, 10);
		obj.add();
		int d=obj.multiply();
		System.out.println("mult="+d);
		
		
	}

}
