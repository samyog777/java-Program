package Week_4_workshop;

public class queestion10 {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setCustomerId(34122);
		c.setName("Samyog");
		c.setBankAccoount(124521);
		int Id = c.getCustomerId();
		String name = c.getName();
		int Account = c.getBankAccoount();
		System.out.println("Id: "+Id);
		System.out.println("name: "+name);
		System.out.println("Account: "+Account);
	}

}

class Customer{
	private int customerId;
	private String name;
	private int BankAccount;
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setName (String name) {
		this.name = name;
	}
	public void setBankAccoount(int BankAccount) {
		this.BankAccount = BankAccount;
	}
	public int getCustomerId() {
		return customerId;
	}
	public String getName() {
		return name;
	}
	public int getBankAccoount() {
		return BankAccount;
	}
}




