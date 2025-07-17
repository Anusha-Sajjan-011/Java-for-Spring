package day17;
// scenario 1) String -->int,double,boolean,char

/*
String --> int  Integer.parseint(string value) 
String-->double Double.parseDouble(string value)
String-->bool   Boolean.parseBoolean(string value)
String-->char   Not possible


*/
// scenario 2) int,double,boolean,char--->String

/*
 * any datatype --> strins valueOf() 
 */


public class DataConversion {


	public static void main(String[] args) {
		//String --> int
//		String s="welcome";  // cannot convert into int bcz all are alphabets
//		int sint = Integer.parseInt(s);
		String s1="34";
		String s2="34";
		System.out.println( Integer.parseInt(s1)+Integer.parseInt(s2));
		
//		String-->double
		System.out.println( Double.parseDouble(s1)+Double.parseDouble(s2));
		
//		String-->bool 
		String s = "welcome"; // if we pass other then true, it return false
		System.out.println(Boolean.parseBoolean(s));
		
//		int,double,bool,char  --> String
		
		int a=10;
		double d=10.2;
		char c='a';
		boolean bool = true;
		System.out.println(String.valueOf(bool));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(a));
		
		
		
	}

}
