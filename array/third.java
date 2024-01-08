package array;
import java.util.Scanner;

public class third {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter your target: ");
		int target = Scan.nextInt();
		
		int[] array = {1,2,3,4,5,7,0,8};
		
		int tar = linearSearch(array,target);
		if (tar == -1) {
			System.out.println("Not found");
		} else {
			System.out.println("Found at " + tar + " index");
		}
	}
	
	public static int linearSearch(int array[], int target) {
		for (int i=0;i<array.length;i++) { 
			if (array[i]==target) {
				return i;
			}
		}
		return -1;
	}

}
