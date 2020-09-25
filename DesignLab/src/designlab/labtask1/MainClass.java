package designlab.labtask1;

public class MainClass {

	public static void main(String[] args) {
		Account a =new Account("waqas",1000);
		Transaction t=new Transaction("credit", 100);
		a.post(t);
		System.out.println(a.getBalance());
	}

}
