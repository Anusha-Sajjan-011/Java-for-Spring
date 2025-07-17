package day11;

public class MethodsMain {

	public static void main(String[] args) {
		Methods m =new Methods();
		m.m1();
		
		String s=m.m2(); // if we use return type then we have to call method in syso or we have to assign the method to a variable of return type
		System.out.println(s);
		
		m.m3("sam");
		
		String s2=m.m4("sam");
		System.out.println(s2);
	}
	

}
