package day15;

//final keyword is used to set a variable value fixed we cannot able to change it anywhere 
	//final can be applied  to class variables methods


 class Final    
 {
	 final int x=10;  // cnnot be changeble 
 }
 
public class Super_final {
	
	//super keyword is belongs to overriding concept
	// super keyword is used to change value of child class variable to parent class variable
	
	
	public static void main(String[] args) {
		Final f = new Final();
		//System.out.println(f.x=20);  throws error 
		System.out.println(f.x);

	}

}
