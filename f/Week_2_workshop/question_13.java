package Week_2_workshop;
import java.util.Scanner;

public class question_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner (System.in);
		
		System.out.println("Enter the double data: ");
		double number = Scan.nextDouble();
		
		int int_num = (int) number;
		long long_num = (long) int_num;
		
		System.out.println("Double value: " + number);
		System.out.println("Int value: " + int_num);
		System.out.println("Long value: " + long_num);
		
	Scan.close();
	}

}
