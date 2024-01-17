package Arrays;
import java.util.Scanner;

public class Hey {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter the amount of U.S. dollor: ");
		double Amount = Scan.nextDouble();
		
		System.out.println("Enter the Exchange rate of the currency: ");
		Double Exchange_rate = Scan.nextDouble();
		
		double Exchange_Money = Amount * Exchange_rate;
		System.out.println("The exchange rate of the " + Amount + " U.S. with the exchange rate of " + Exchange_rate + " is: " + Exchange_Money);
	}
}
