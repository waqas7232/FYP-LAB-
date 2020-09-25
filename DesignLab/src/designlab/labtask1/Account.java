package designlab.labtask1;

import java.util.Vector;

public class Account {
private String name;
private int balance;
private Vector<Transaction> history=new Vector<Transaction>();
public Account(String name,int balance) {
	this.name=name;
	this.balance=balance;
}
public boolean checkTransaction(Transaction t) {
	if(t.getType().equals("debit") && t.getAmount()>balance) {
		return false;
	}
	else {
		return true;}
}
public void post(Transaction t) {
	if(checkTransaction(t)) {
		if(t.getType().equals("debit")) {
			balance=balance-t.getAmount();
			history.add(t);
			System.out.println("debit Transaction done");
		}
		else if(t.getType().equals("credit")) {
			balance=balance+t.getAmount();
			history.add(t);
			System.out.println("credit Transaction done");
		}
		else {
			System.out.print("Not supported");
		}
	}
}
public String getName() {
	return name;
}

public int getBalance() {
	return balance;
}


}
