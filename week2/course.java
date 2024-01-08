package week2;
import java.util.Scanner;

public class course {

	public static void main(String[] args) {
		Scanner Scan = new Scanner (System.in);
		String Course;
		
		System.out.println("Enter the course: ");
		Course = Scan.nextLine();
	
		switch (Course) {
			case "BIT" :
				System.out.println("3 years");
				break;
			case "BIBM" :
				System.out.println("4 years");
				break;
			case "BCA" :
				System.out.println("4 Years");
				break;
			default :
				System.out.println("Not aviliable");
		}
		Scan.close();
	}

}
