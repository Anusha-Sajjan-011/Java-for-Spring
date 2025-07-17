package day14;

// single inheritance

class a
{
	int a=10;
	void display()
	{
		System.out.println(a);
	}
}
	
	class b extends a
	{
		int b=20;
		void show()
		{
			System.out.println(b);
		}
	}


public class InheritanceTypes {

	public static void main(String[] args) {
		b obj = new b();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.display();
		obj.show();
		

	}

}
