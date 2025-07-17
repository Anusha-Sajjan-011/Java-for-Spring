package day4;

public class Hw {

	public static void main(String[] args) {
		int a=10,b=20;
		if(a<b)
		{
			System.out.println("a is smaller");
		}
		else
		{
			System.out.println("b is smaller");
		}
		System.out.println((a<b)? true:false);
		String week="saturday";
		switch(week)
		{
			case "sunday":
				System.out.println("1");
				break;
			case "monday":
				System.out.println("2");
				break;
			case "tuesday":
				System.out.println("3");
				break;
			case "wednesday":
				System.out.println("4");
				break;
			case "thursday":
				System.out.println("5");
				break;
			case "friday":
				System.out.println("6");
				break;
			case "saturday":
				System.out.println("7");
				break;
			default:
				System.out.println("invalid week name");
				
		}

	}

}
