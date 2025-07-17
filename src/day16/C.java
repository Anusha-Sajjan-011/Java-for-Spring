package day16;

public class C extends C1 implements I1,I2 
{
	public void m1()
	{
		System.out.println("value of a is: "+a);
	}
	public void m2()
	{
		System.out.println("value of b is: "+b);
	}

	public static void main(String[] args) {
		C cobj = new C();
		cobj.m1();
		cobj.m2();
		cobj.m3();
		
	}

}
