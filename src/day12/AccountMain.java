package day12;

public class AccountMain {

	public static void main(String[] args) {
		Account a=new Account();
		a.setAccno(1);
		System.out.println(a.getAccno());
		a.setAmount(40000);
		System.out.println(a.getAmount());
		a.setName("abc");
		System.out.println(a.getName());
	}

}
