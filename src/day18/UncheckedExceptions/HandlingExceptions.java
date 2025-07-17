package day18.UncheckedExceptions;

import java.util.Scanner;

public class HandlingExceptions {
	public static void main(String[] args) {
		System.out.println("program is started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enterr a num: ");
		int num =sc.nextInt();
		try
		{
			System.out.println(100/num);
		}
		catch(ArithmeticException e )
		{
			System.out.println("invalid number"+e.getMessage());
		}
		
		System.out.println("program is completed");
		System.out.println("program is exited..");
		sc.close();
	}
}
