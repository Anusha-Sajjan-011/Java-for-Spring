package day12;

public class Polymorphism {
	//polymorphism 
	/*one thing can have many forms
	
	Shape-circle,square,triangle,etc
	water-vapour,ice burge,etc
	
	we can achive polymorphism through overloading
	*/
	
	// overloading :- multiple methods with same name but different type of parameter,oder of parameters
	/*-----4 rules for method overloading----
	 * method names should be same
	 * number of parameters should be different
	 * data type of parameters should be different
	 * order of parameters should be different
	 */
	int a=10,b=20;
	void sum() //method names should be same
	{
		System.out.println("sum is: "+(a+b));
	}
	void sum(int x,int y) // number of parameters should be different
	{
		System.out.println("sum is : "+(x+y) );
	}
	void sum(int x,double y)//data type of parameters should be different
	{
		System.out.println("sum is "+(x+y));
	}
	void sum(double x,int y)//order of parameters should be different
	{
		System.out.println("sum is "+(x+y));
	}
	void sum(int a,int b, int c)
	{
		System.out.println("sum is :"+(a+b+c));
	}
	

}
