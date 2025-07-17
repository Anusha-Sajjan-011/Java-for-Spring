package day9;

//import java.util.Arrays;

public class StringReverse {

	public static void main(String[] args) {
		//approach 1 using length(),charAt()
		/*String s="welcome";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		*/
		
		
		// approach 2  by converting string to char array
		//without using string methods
		/*String s1="welcome";
		String reverse="";
		char c[]=s1.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			reverse=reverse+c[i];
		}
		System.out.println(reverse);
		*/
		
		// approach 3 using built in method stringbuffer class
		StringBuffer s =new StringBuffer("welcome"); //enable String mutable 
		System.out.println(s.reverse());
		
		//approach 4 using stringbuilder class
		StringBuilder sb=new StringBuilder("welcome");
		System.out.println(sb.reverse());
		
		
		
		
	}

}
