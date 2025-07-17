package day6;

public class Array {

	public static void main(String[] args) {
		// declaring
//		int a[] = new int[5];
//		a[0]=100;
//		a[1]=200;
		int a[]= {1,2,3,4,5};
		// read from specific location
		System.out.println(a[4]);
		//length 
		System.out.println(a.length);
		// to read all elements
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		// using for each loop
		for(int x:a)
		{
			System.out.println(x);
		}

	}

}
