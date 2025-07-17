package day13;

public class StaticDemo {
//	int a=10; 
	static int a=10; //static var
	int b=20;  // non-static var
	
	void m1() // non-static method
	{
		System.out.println("non static method");
	}
	static void m2() // static method
	{
		System.out.println("static methods");
	}
	// we can access every variable and methods(static and non static) in non-static method
	void display()
	{
		System.out.println(a);//static var
		System.out.println(b);// non-static var
		m1();// non-static method
		m2();// static method
	}
//	public static void main(String[] args) {
////		m2(); // no need of object for static method or variables
////		System.out.println(a);
////		StaticDemo sd= new StaticDemo(); // non-static methods and variables need objects to access them
////		sd.m1();
////		System.out.println(sd.b);
//		StaticDemo sd1=new StaticDemo();
//		sd1.display();
//		
//		
//	}

}
