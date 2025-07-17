package day14;
class Parent
{
	void display(int a)
	{
		System.out.println(a);
	}
}
class child1 extends Parent
{
	void show(int b)
	{
		System.out.println(b);
	}
}
class child2 extends child1
{
	void print(int c)
	{
		System.out.println(c);
	}
}
public class HirarchialInheritance {

	public static void main(String[] args) {
		child1 c1 = new child1();
		c1.display(1);
		c1.show(3);
		
		child2 c2 = new child2();
		c2.print(22);
		c2.display(21);

	}

}
// multiple inheritance is not possible through class
// it can be acheived through interfaces

/* why multiple inheritence is not possible by class ?
because extends keyword support only one class not multiple class.
ambiguity reason
when u create a class in java by default it is extended from object class[it is a root class]
*/
