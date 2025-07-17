package day18.UncheckedExceptions;

import java.util.Scanner;

public class MultiCatch {
	public static void main(String[] args) {
		// If we dont know the exceptions we can handle it with placing multiple catch blocks.
		// or just catch(exception e)
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		try
		{
			System.out.println(200/num);
			
		}
//		catch(ArithmeticException e)
//		{
//			System.out.println(e.getMessage());
//			System.out.println("invalid data");
//		}
//		catch(NullPointerException e)
//		{
//			System.out.println(e.getMessage());
//		}
//		catch(NumberFormatException e)
//		{
//			System.out.println(e.getMessage());
//		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("program executed..");
		
		sc.close();
	}
}
