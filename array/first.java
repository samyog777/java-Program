package array;
import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
	
		
        System.out.println("Enter a number to search: ");
        int target = Scan.nextInt(); 

        int[] array = {1, 2, 3, 4, 5};
        int index = linearSearch(array, target);
        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
	
	 public static int linearSearch(int[] array, int target) {
		 for (int i = 0; i < array.length; i++) {
	            if (array[i] == target) {
	                return i;  // Return the index if target is found
	            }
	        }
	        return -1;  // Return -1 if target is not found
	 }
}
	
