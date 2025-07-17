package day9;

public class StringBufferStringBuilder {

	public static void main(String[] args) {
		String s="hello";
		s.concat("welcome");
		System.out.println(s);// string is immutable
		
		StringBuffer sb=new StringBuffer("hello");
		sb.append("welcome");
		System.out.println(sb); // with SB class, string can be mutable

		StringBuilder sb1=new StringBuilder("hello");
		sb1.append("world");
		System.out.println(sb1); //StringBuilder class also makes string mutable
		
		
	}

}
