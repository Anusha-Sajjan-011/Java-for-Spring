package day15;

//below there are three methods
class abc
{
	void m1(int a)
	{
		System.out.println(a);
	}
	void m2(int b)
	{
		System.out.println(b);
	}
}
class def extends abc
{
	void m1(int a)
	{
		System.out.println(a*a);
	} //overriding only we can achive in inheritance
	void m2(int x,int y)
	{
		System.out.println(x*y);
	} //overloading we can achieve with or without inheritance, with single o rmultiple classes, polymorphism concept
}

public class OverLoadOverRide {

	public static void main(String[] args) {
		def d = new def();
		d.m1(3);
		d.m2(44);
		d.m2(1, 56);

	}

}
