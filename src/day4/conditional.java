package day4;

public class conditional {

	public static void main(String[] args) 
	{
		int age=20;
		if(age>=18)
		{
			System.out.println("eligible for vote");
		}
		else
		{
			System.out.println("not eligible");
		}
		
		int num = 10;
		if(num % 2 == 0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}

		int x =1;
		if(x >0)
		{
			System.out.println("pos");
		}
		else if(x<0)
		{
			System.out.println("negative");
		}
		else
		{
			System.out.println("zero");
		}
		
		int a=6,b=2,c=3;
		if(a>b && a>c)
		{
			System.out.println("a is largest");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is largest");
		}
		else
		{
			System.out.println("c is largest");
		}
	}

}
