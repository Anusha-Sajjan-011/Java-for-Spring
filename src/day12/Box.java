package day12;

public class Box {
	double width,height,depth;
	//constructor overloading
	Box() // constructor1
	{
		width=height=depth=0;
	}
	Box(double w,double h,double d) //constructor 2
	{
		width=w;
		height=h;
		depth=d;
	}
	Box(double len) // constructor 3
	{
		width=height=depth=len;
	}
	double volume()
	{
		return (width*height*depth);
	}

}
