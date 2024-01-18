package Week_3_workshop;
import java.util.Scanner;
import java.util.Arrays;

public class try_array {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int size = Scan.nextInt();

		int[] array = new int[size];
		System.out.println("Enter the value of array: ");
		for (int i = 0; i < size; i++) {
			array[i] = Scan.nextInt();
		}
		
		System.out.println("The array you entered is: ");
		System.out.println(Arrays.toString(array));
		
		System.out.println("The inverse of your array is: ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		Scan.close();
	}

}
