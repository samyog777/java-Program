package week_3_tutorial;
import java.util.Scanner;

public class linear_search {
	
    public static void main(String[] args) {
        // linear search
        int[] marks = {10, 20, 30, 40, 50};
        Scanner Scan = new Scanner(System.in);
        
        System.out.print("Enter value of array: ");
        int n = Scan.nextInt();
        
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == n) {
                System.out.println("Element found at " + i + " index");
                break;
            } else {
                System.out.println("Element not found at " + i + " index");
            }
            System.out.println(marks[i]);
        }
        Scan.close();
    }
}
