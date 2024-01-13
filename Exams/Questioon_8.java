package Exams;
import java.util.Scanner;

public class Questioon_8 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter a size: ");
		int size = Scan.nextInt();
		
		for (int i=1;i<=size;i++) { // For rows
			for(int j =1;j<=size-i;j++) { // For Space
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print(i); // print number
			}
			System.out.println();
		}
		for (int i=size-1;i>=1;i--) { // for rows
			for(int j=1;j<=size-i;j++) { // for space
				System.out.print(" ");
			}
			for (int k=1;k<=2*i-1;k++) { // for number
				System.out.print(i);
			}
			System.out.println();
			Scan.close();
		}		
	}

}
