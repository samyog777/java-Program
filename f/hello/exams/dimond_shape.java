package Exams;
import java.util.Scanner;
public class dimond_shape {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter size");
		int size = Scan.nextInt();
		
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=size-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print(i);
			}
			System.out.println();
		}
		for(int i=size-1;i>=1;i--) {
			for(int j=1;j<=size-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print(i);
			}
			System.out.println();
			Scan.close();
		}

	}

}
