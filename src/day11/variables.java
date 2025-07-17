package day11;

public class variables {
	int id;
	String name;
	char grade;
	
	void display()
	{
		System.out.println(id+" "+name+" "+grade);
	}
	
	//2) assigning variables with methods
	void setvariables(int sid,String sname,char sgrade)
	{
		id=sid;
		name=sname;
		grade=sgrade;
	}
	
	/*3) using constructors to initialize variables 
	*constructor have same name of class name
	*it uses parameters like methods
	*inside constructor we only initialize variables
	*constructor does not have return type
	*it is also a method 
	*/
	variables(int sid,String sname,char sgrade)
	{
		id=sid;
		name=sname;
		grade=sgrade;
	}
}
