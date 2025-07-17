package day8;

public class Strings {

	public static void main(String[] args) {
		String s ="   this is a string  ";
		System.out.println(s);
		System.out.println(s.length()); // s.length() return length of a string
		
		//combining strings using concat()
		String s1="java";
		System.out.println(s+s1);
//		System.out.println(s.concat(s1));
		
		//trim() removes spaces right and left side
		System.out.println(s1.trim());
		
		//charAt()- return a character from a string based on index
		String s3="afffef";
		System.out.println(s3.charAt(5));
		
		//contains() checks the part of the string,returns true false
		System.out.println(s.contains("is"));
		
		//equals() equalsIgnoreCase()
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s));
		
		//replace()
		System.out.println(s.replace("this","it"));
		
		//substring() extract substring 
		System.out.println(s1.substring(0,3));
		
		//toLowerCase() toUpperCase()
		String a1="afjf";
		System.out.println(a1.toLowerCase());
		
		//split() splits string into multiple parts based on delimeter
		String str="ajfd";
		String a[]=str.split("f");
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		String amt="$15,20,55";
		System.out.println(amt.replace("$",""));
		System.out.println(amt.replace("$15,20,55","152055"));
//		System.out.println(amt.replace("$","").replace(",",""));
		
		String z="abc,123@xyz";
		System.out.println(z.replace(","," ").replace("@"," "));
		//using split method
		String arr[]=z.split(",");
		String arr1[]=arr[1].split("@");
		System.out.println(arr[0]+" "+arr1[0]+ arr1[1]);
		
		

	}

}
