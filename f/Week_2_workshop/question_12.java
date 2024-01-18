package Week_2_workshop;
import java.util.Scanner;

public class question_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter the integer value: ");
		int number = Scan.nextInt();
		
		float float_number = (float) number;
		long long_number = (long) number;
		
		System.out.println(number);
		System.out.println("Float value: " + float_number);
		System.out.println("Long value: " + long_number);
		
		Scan.close();
	}

}
