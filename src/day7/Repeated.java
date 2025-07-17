package day7;

public class Repeated {

	public static void main(String[] args) {
		int a[]= {10,20,30,10,10,20};
		int same=0;
		int num=10;
		for(int i=0;i<a.length;i++)
		{
			if(num==a[i])
				same++;
			
		}
		System.out.println(same);

	}

}
