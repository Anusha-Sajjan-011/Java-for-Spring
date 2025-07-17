package day9;

public class StringComparision {

	public static void main(String[] args) {
//		scenario 1
		/*String s1="hello";
		String s2="hello";
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //true
		*/
		
		//scenario 2
		/*String s1=new String("hello");
		String s2=new String("hello");
		System.out.println(s1==s2); // false == compares string objects
		System.out.println(s1.equals(s2)); // true .equals compares values of objects
		*/
		
		//scenario 3
		/*String s1="abc";
		String s2=new String("abc");
		System.out.println(s1==s2);// false
		System.out.println(s1.equals(s2)); // true
		*/
		
		//scenario 4
		String s1="hello";
		String s2=new String("hello");
		String s3=s2;
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s3));//true
		System.out.println(s2==s3);//true
		System.out.println(s2.equals(s3));//true
		
	}

}
