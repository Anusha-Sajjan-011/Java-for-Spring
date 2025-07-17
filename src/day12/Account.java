package day12;

public class Account {
	private int accno;
	private String name;
	private double amount;
	/*
	void set_accno(int accno) //if we use same variable name of a class  in a method then we have to use this keyword 
	{
		this.accno=accno;
	}
	void set_name(String n)
	{
		name=n;
	}
	void set_amount(double amt)
	{
		amount=amt;
	}
	void get_accno()
	{
		System.out.println("your account number is: "+accno);
	}
	void get_name()
	{
		System.out.println("your name is: "+name);
	}
	void get_amount()
	{
		System.out.println("amount: "+amount);
	}
	*/
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
}
