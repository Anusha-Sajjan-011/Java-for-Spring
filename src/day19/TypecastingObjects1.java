package day19;

class Animal{}

class Dog extends Animal{}

class Cat extends Animal{}


public class TypecastingObjects1 {
//	Rule 1 -- relationship between obj((cat)a))--conversion is valid or not
//	Rule 2 --assignment is valid or not--Cat c = (Cat)a;
//	Rule 3 -- the underlying object of 'd' must be either same or child of 'c'
	

	public static void main(String[] args) {
//		Animal a = new Dog();
//		Cat c = (Cat)a;// valid conversion bcz (cat)a; has parent child relationship
//		Dog d = new Dog();
//		Cat c = (cat)d; // invalid no relation between(Cat)d ;
		//Dog d = (Dog) a; // 3 rules satisfied
		
	}

}
