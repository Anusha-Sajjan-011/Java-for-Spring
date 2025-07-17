package day5;

public class WhileLoop {
	public static void main(String args[])
	{
//		int i=1;
//		while(i<=10)
//		{
//			System.out.println(i);
//			i++;
//		}
//		int i=1;
//		while(i<=10)
//		{
//			System.out.println("hey");
//			i++;
//		}
		int i=10;
		while(i>=1)
		{
			if(i%2==0) {
				System.out.println(i+" even");
			}
			else
			{ 
				System.out.println(i+" odd");
			}
			//System.out.println(i);
			i--;
		}
		
	}
}
