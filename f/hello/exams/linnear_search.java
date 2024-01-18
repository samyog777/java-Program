package Exams;
import java.util.Scanner;

public class linnear_search {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		int my_array[] = {10,20,30,40};
		System.out.println("Enter an element to search in the my_arrayay: ");
		
		int key = Scan.nextInt();
		int val = linearSearch(my_array,key);
		
		if (val>=0) {
			System.out.println("Element found at index " + val + " or position "+ ++val);
		} else {
			System.out.println("Element not found in this array");
		}
		Scan.close();
	}
	
	public static int linearSearch(int my_array[], int key) {
		for(int i=0;i<my_array.length;i++) {
			if (my_array[i] == key) {
				return i;
			}
		}
		return -1;
	}
}

