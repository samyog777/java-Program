package Week_4_workshop;
import java.util.Scanner;

class BankAccount {
	int accountnumber;
	double balance;
	String accountHolderName;
	String accountHolderAddress;
	void Details() {
		System.out.println("Account number: "+accountnumber);
		System.out.println("Balance: "+ balance);
		System.out.println("Account Name: "+accountHolderName);
		System.out.println("Account Holder Address: "+accountHolderAddress);
	}
	void depositMoney(int a) { 
		balance += a;
	}
	
	void withdrawMoney(int c) {
		balance -= c;
	}
}
public class question1_2_3 {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter money to deposit: ");
		int a = Scan.nextInt();  
		
		System.out.println("Enter money to with draw money: ");
		int c = Scan.nextInt();
		
		BankAccount b = new BankAccount();
		b.accountnumber = 2358296;
		b.balance = 13454.312;
		b.accountHolderName = "Samyog Koirala";
		b.accountHolderAddress = "Brammakhel";
		b.depositMoney(a);
		b.withdrawMoney(c);
		b.Details();
		
		Scan.close();
	}
}

