package Data;

class Client {
	
	private String Name;
	private int Credit;
	protected Client(String name, int credit) {
		this.Name=name;
		this.Credit=credit;
	}
	protected int getCredit() {
		return Credit;
	}
	protected void setCredit(int credit) {
		Credit = credit;
	}
	protected String getName() {
		return Name;
	}
}