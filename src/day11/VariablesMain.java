package day11;

public class VariablesMain {

	public static void main(String[] args) {
		// when constructor is created it is invoked through the object in the run time hence no need to call constructor
		
//		variables v=new variables();
		
		//1) using object reference variables
		/*v.id=1;
		v.name="sam";
		v.grade='A';
		v.display();
		*/
		
		//2) calling method with parameters
		/*v.setvariables(1, "sav",'A');
		v.display();
		*/
		
		//3) // when constructor is created it is invoked through the object in the run time hence no need to call constructor
		variables v=new variables(2,"sui",'A');
		v.display();
		
		
	}

}
