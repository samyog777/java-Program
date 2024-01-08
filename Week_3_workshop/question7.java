package Week_3_workshop;
import java.util.Scanner;

public class question7 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int a = Scan.nextInt();
		boolean found = false;
		
		for (int i=0;i<array.length;i++) {
			if (array[i] == a) {
				System.out.println(a+" is present in the given array at "+i+" th index");
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Not in the given array");
		}
		Scan.close();
	}

}
