package day3;

public class Operators {

	public static void main(String[] args) 
	{
		//Arithmetic + - * / %
		int a=10,b=20;
		System.out.println("sum of a and b is "+(a+b));
		System.out.println("difference of a and b is "+(a-b));
		System.out.println("prod of a and b is "+(a*b));
		System.out.println("division of a and b is "+(a/b));
		System.out.println("quot of a and b is "+(a%b));
		
		//Relational > >= < <= != ==
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(" ");
		
		//Logical && || !
		boolean a2=true,b2=false;
		System.out.println(a2&&b2);
		System.out.println(a2||b2);
		System.out.println(!a2);
		System.out.println(!b2);
		//System.out.println((10<5)&&(15>10));
		System.out.println(" ");
		
		//Increment and decrement ++ --
		int x=10;
		System.out.println(x);
		x++;
		System.out.println(x);
		
		int y =10;
		System.out.println(y);
		y--;
		System.out.println(y);
		System.out.println(" ");
		
		//Assignment = += -= /= *= %=
		int x1=10;
		System.out.println(x1);
		x1*=5;
		System.out.println(x1);
		System.out.println(" ");
		
		//conditional/ternary ?:
		//var=exp ? res1: res2;
		int l=10,s=20;
		int res=(l<s)? l:s;
		System.out.println(res);
		
		int age=30;
		String res1=(age>=18)?"eligible for vote":"not eligible for vote";
		System.out.println(res1);
		
		
	}

}
