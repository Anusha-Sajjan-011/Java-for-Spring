package day18.UncheckedExceptions;

public class Finally {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		String s =null;
		try
		{
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("this is final ");
		}
	}
}
