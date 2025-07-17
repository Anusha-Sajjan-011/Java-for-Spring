package day6;

public class ObjArray {

	public static void main(String[] args) {
		// To include different data[heterogenious] inside array we use Object data type
		Object a[]= {1,2,"a",'b','x'};
		/*for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}*/
		for(Object x:a)
		{
			System.out.println(x);
		}

	}

}
