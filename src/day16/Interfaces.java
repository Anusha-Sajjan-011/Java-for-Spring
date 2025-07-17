package day16;

/*
 * 1)interface is a blue print of class
 * 2)interface contains final and static variables
 * 3)it contains abstract methods(also default & static methods)
 * 4)abstract methods are the methods which have only definition not implementation(but static and default methods can be implemented)
 * 5)methods in interfaces are public
 * 6)it support the functionalities of multiple inheritance
 * 7)we can define interface with interface keyword
 * 7)a class extends another class , an interface extends another interface but a class implements an interface.
 * 9)we can create object for interface but we cannot instantiate interface
 */
  interface  Shape
  {
	  int len=10; // static & final
	  int wid=20; // static & final
	  
	  void circle(); // abstract method
	  
	  static void area()
	  {
		  System.out.println("this is static method");
	  }
	  default void def()
	  {
		  System.out.println("default method");
	  }
	  
  }
public class Interfaces implements Shape{
		public void circle() // interfaces by default have public modifier therefore we have to use it in implemeted class
	{
		System.out.println("this is abstract method");
	}
		void triangle()
		{
			System.out.println("class method triangle");
		}

	public static void main(String[] args) {
		Interfaces i =new Interfaces();
		i.circle(); // abstract method
		i.def(); // default method
		i.triangle(); // class method
		Shape.area(); // static method [ only accessed directly from interface]
		
		Shape s =  new Interfaces();
		s.circle();
		s.def();
		//s.triangle(); // not access to interface variable
		Shape.area();
	}

}
