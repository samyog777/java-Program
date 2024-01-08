package Week_2_workshop;
import java.util.Scanner;

public class question_5 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Do you have medical cause if yes enter y and for no enter n: ");
		char MC = Scan.next().charAt(0);
		if (MC == 'n') {
			System.out.println("you can sit in the exam. ");
		}
		else if (MC == 'y') {
			System.out.println("you are not allowed to sit in the exam. ");
		}
		else {
			System.out.println("Error");
		}
		Scan.close();
	}

}
