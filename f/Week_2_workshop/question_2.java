package Week_2_workshop;
import java.util.Scanner;

public class question_2 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter your grade: ");
		int grade = Scan.nextInt();
		if (grade > 100) {
			System.out.println("Wronge input");
		}
		else if (grade >= 90 && grade <=100) {
			System.out.println("A+");
		}
		else if (grade >= 80 && grade <= 90) {
			System.out.println("A");
		}
		else if (grade >= 70 && grade <= 80) {
			System.out.println("B+");
		}
		else if (grade >= 60 && grade <= 70) {
			System.out.println("B");
		}
		else if (grade >= 50 && grade <= 60) {
			System.out.println("C+");
		}
		else if (grade >= 40 && grade <= 50) {
			System.out.println("C");
		}
		else if (grade >= 0 && grade <=40) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Wronge input");
		}
		Scan.close();
	}
}
