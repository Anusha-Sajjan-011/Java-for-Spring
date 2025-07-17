package day18.CheckedExcepions;
 // checked exceptions are handled using---
//1) try catch -> WE CAN  write mulptiple catch blocks->
//2) throws


public class  HandlingChecked {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("hello");
		System.out.println("hello2");

//		try
//		{
//		Thread.sleep(5000);// to pause execution 5 second and after that continue execution
//		}
//		catch(Exception e) //this exception  will handle ALL TYPE of exception
//		{
//			System.out.println(e.getMessage());
//		}
		
		Thread.sleep(5000);
		System.out.println("hello3");
		System.out.println("hello4");
		
	}

}

//try{
//
//	statement
//		} catch(){
//
//				}finally{
//				exception occured, catch block handled --> finally block will execute
//exception occured, catch block not handled --> finally block will execute
//Exception does not occured, catch block ignored --> final ly block will execute
//				}