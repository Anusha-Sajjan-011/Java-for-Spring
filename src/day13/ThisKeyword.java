package day13;

//to differentiate the local variables and class variables we use this keyword
public class ThisKeyword {
	int x,y; // class variables or insatance variable
	
	ThisKeyword(int a,int b) // since variables are same as class variables so we use this keyword for reference
	{
		this.x=a;  // local variables
		this.y=b;
	}

//	ThisKeyword(int x,int y) // since variables are same as class variables so we use this keyword for reference
//	{
//		this.x=x;  // local variables
//		this.y=y;
//	}


	void setData(int a, int b){
		x=a;
		y=b;
	}

//	if we take this.x=x and this.y=y than it returns 0
	void display()
	{
		System.out.println(x+" "+y);
	}

	public static void main(String[] args) {
		ThisKeyword tk = new ThisKeyword(1,5);
		tk.display();

	}

}
