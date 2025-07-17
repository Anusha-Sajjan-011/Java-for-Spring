package day3;

public class swap {

	public static void main(String[] args) {
		int a =10,b=20;
		System.out.println("values before swapping: "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;		
		System.out.println("values after swapping: "+a+" "+b);

	}

}
