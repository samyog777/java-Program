package Exams;
import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter numbers:");
		int number = Scan.nextInt();
		int sum = 0;
		while(number != 0) {
			int digit = number %10;
			sum += digit;
			number /=10;
		}
		System.out.println(sum);
		
		if (check_odd(sum)){
			System.out.println("It it odd");		
		} else {
			System.out.println("It is even");
		}
	}
	
	public static boolean check_odd(int sum) {
		return sum%2==1;
	}
}
