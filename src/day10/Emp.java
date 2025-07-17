package day10;

public class Emp {
	//variable or attributes
	int eid;
	String ename;
	String job;
	int sal;
	
	//methods 
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
		
	}
	
	public static void main(String[] args) {
		Emp e1=new Emp();
		e1.eid=1;
		e1.ename="abc";
		e1.job="sw";
		e1.sal=45000;
		e1.display();
		
		Emp e2=new Emp();
		e2.eid=10;
		e2.ename="abcd";
		e2.job="swe";
		e2.sal=45000;
		e2.display();

	}

}
