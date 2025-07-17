package day9;



public class Assignments {

	public static void main(String[] args) {
		// string palindrome
		/*String s="madama";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println("palindrome");
			
		}
		else
			System.out.println("not palindrome");
		*/
		
		// remove special character in string and white spaces
		/*String a="ad@dfw e l co me";
		System.out.println(a.replace("@","")+"\n"+a.replace(" ",""));
		*/
		
		// count occurence of charecter in a string and number of words in string
		/*String s="aabbccaa";
		char a1[]=s.toCharArray();
		int count=0;
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]=='a')
				count++;
		}
		System.out.println(count);
		*/
		
		/*String s="welcome to java and world" ;
		int count=0;
		String b[]=s.split(" ");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
			count++;
		}
		System.out.println("words are:"+count);
		*/
	}

}
