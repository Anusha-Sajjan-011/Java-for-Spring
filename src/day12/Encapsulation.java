package day12;

public class Encapsulation {
// wrapping up of data and methods in to single unit(class)
	/*
	 * make all variables are private [variables are access inside only a class]
	 * for each variable we have to create 2 methods setter method for setting value to variable and getters to retrieve value from variable
	 */
	private int a;
	private int b;
	void set_a(int x)
	{
		a=x;
	}
	void set_b(int y)
	{
		b=y;
	}
	void get_a()
	{
		System.out.println(a);
	}
	void get_b()
	{
		System.out.println(b);
	}
}
