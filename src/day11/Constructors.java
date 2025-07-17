package day11;

public class Constructors {
	int x;
	int y;
	Constructors() // default constructor
	{
		x=10;
		y=20;
	}
	Constructors(int a,int b) // parameterized constructor
	{
		x=a;
		y=b;
	}
	void display()
	{
		System.out.println("value of x: "+x);
		System.out.println("value of y: "+y);
	}

	public static void main(String[] args) {
		Constructors c = new Constructors();
		c.display();

	}

}
