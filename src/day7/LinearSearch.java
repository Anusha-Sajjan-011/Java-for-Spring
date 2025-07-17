package day7;


public class LinearSearch {

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50};
		int se=30;//search element
		boolean status=false;
		for(int i=0;i<a.length;i++)
		{
//			System.out.println(a[i]);
			if(a[i]==se)
			{
					System.out.println("element found");
					status=true;
					break;
			}
		}
		if(status==false)
		{
		System.out.println("not found");
		}
	}

}
