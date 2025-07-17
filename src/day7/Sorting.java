package day7;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int a[]= {12,32,11,10,43,3,21};
		
		System.out.println("before sorting..");
//		for(int x:a)
//		{
//			System.out.println(x);
//		}
		System.out.println(Arrays.toString(a));
		
		System.out.println("after sorting");
		Arrays.sort(a); // sort built in function
		System.out.println(Arrays.toString(a));
		
		char s[]= {'d','b','a','c'};
		System.out.println("before sorting: \n"+Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("after sorting: \n"+Arrays.toString(s));
	}

}
