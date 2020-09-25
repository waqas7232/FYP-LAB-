package designlab.labtask1;

public class Transaction {
	private int amount;
	private String type;
	public Transaction(String type,int amount) {
		this.type=type;
		this.amount=amount;
	}
	String getType() {
		return this.type;
	}
int getAmount() {
	return this.amount;
}

}
