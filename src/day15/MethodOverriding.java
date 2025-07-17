package day15;
//hirarchical inheritance
class Bank
{
	double roi()
	{
		return 0;
	} //roi-> rate of interest
}
class Canara extends Bank
{
	double roi()
	{
		return 5.0;
	}
}
class SBI extends Bank
{
	double roi()
	{
		return 4.0;
	}
}

public class MethodOverriding {
	 // the method created in parent class is extended in child class with same method but with different implementation is called method overriding
	// without inheritance we cannot achieve overriding
	public static void main(String[] args) {
		Bank b =new Bank();
		System.out.println(b.roi());
		Canara c = new Canara();
		System.out.println(c.roi());
		SBI s= new SBI();
		System.out.println(s.roi());

			
	}

}
