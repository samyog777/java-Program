package Exams;
import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.print("Enter a number to check odd or even: ");
		int number = Scan.nextInt();
		if (wow.isodd(number)) {
			System.out.println("this is odd number");
		} else {
			System.out.println("It is even");
		}
		Scan.close();
	}
}

class wow {
	public static boolean isodd(int number) {
		return number%2 == 1;
	}
}
