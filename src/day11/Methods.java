package day11;

public class Methods {
	//no parameters no return value
	void m1()
	{
		System.out.println("method 1");
		
	}
	//no parameters with return value
	String m2()
	{
		return "method 2";
	}
	//takes parameter no return value
	void m3(String name)
	{
		System.out.println("method 3 "+name);
	}
	//takes parameter with return value
	String m4(String name)
	{
		return "method 4".concat( name);
	}
}
