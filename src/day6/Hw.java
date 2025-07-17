package day6;

public class Hw {

	public static void main(String[] args) {
		/*int a[]= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println(sum);*/
		
//		count even odd in given number
		int a[]= {1,2,3,4,5,6};
		int e=0;
		int o=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				e++;
				

			}
			else
			{
				o++;
			}	
		}
		System.out.println(e+" even");
		System.out.println(o+" odd");


	}

}
