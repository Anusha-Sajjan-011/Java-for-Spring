package day14;

class a1
{
	int a=10;
	void display()
	{
		System.out.println("class a");
	}
}
class b1 extends a1
{
	int b=20;
	void show()
	{
		System.out.println("class b");
	}
}
class c extends b1
{
	int c =30;
	void see()
	{
		System.out.println("class c");
	}
}

public class MultiLevel {

	public static void main(String[] args) {
		c obj = new c();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		obj.display();
		obj.see();
		obj.show();

	}

}
