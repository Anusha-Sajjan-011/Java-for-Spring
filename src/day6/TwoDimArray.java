package day6;

public class TwoDimArray {
	public static void main(String args[])
	{
		//declaring
//		int a[][]=new int[3][2];
//		a[0][0]=10;
//		a[0][1]=20;
//		a[1][0]=30;
//		a[1][1]=40;
//		System.out.println(a[1][0]);
		
		int a[][]= {{1,2},{3,4}};
//		System.out.println(a.length);
//		
//		// specific element
//		System.out.println(a[0][1]);
//		
//		// print all numbers
//		for(int r=0;r<a.length;r++)
//		{
//			for(int c=0;c<a.length;c++)
//			{
//				System.out.print(a[r][c]+" ");
//			}
//			System.out.println();
//		}
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.println(x);
			}
		}
	}
	
}
