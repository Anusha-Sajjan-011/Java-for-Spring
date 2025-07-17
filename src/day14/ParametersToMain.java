package day14;

public class ParametersToMain {
	// to pass parameters to main method go to run as then run configuration then arguments tag then pass arguments there 
	public static void main(String[] args) {
		System.out.println(args.length);
		for(String  value:args)
		{
			System.out.println(value);
		}
	}

}
