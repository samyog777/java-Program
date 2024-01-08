package Week_3_workshop;
import java.util.Scanner;
import java.util.Arrays;

public class classwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner (System.in);
		
		int size;
		System.out.println("Enter size of an array: ");
		size = Scan.nextInt();
		int a[] = new int[size];
		
		System.out.println("Enter elements of an array: ");
		for (int i = 0; i< size; i++) {
			a [i] = Scan.nextInt();
			
		}
			System.out.println("The element of an array is: ");
			System.out.println(Arrays.toString(a));
			Scan.close();
	}
}
