package Week_2_workshop;
import java.util.Scanner;

public class question_9 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter your grade: ");
		String grade = Scan.nextLine();
		
		switch (grade) {
		case "A+":
			System.out.println("Excellent !");
			break;
		case "A":
			System.out.println("Outstanding !");
			break;
		case "B+":
			System.out.println("Good!");
			break;
		case "B":
			System.out.println("Can do better !");
			break;
		case "C+":
			System.out.println("Just Passed !");
			break;
		default :
			System.out.println("invalid grade !");
		}
		Scan.close();
	}
}
