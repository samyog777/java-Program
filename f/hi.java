import java.util.Scanner;
public class hi {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
            int spaces = number / 2;
            int stars = 1;

            // Upper half of the diamond
            for (int i = 1; i <= number; i += 2) {
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < stars; j++) {
                    System.out.print(i);
                }
                System.out.println();
                spaces--;
                stars += 2;
            }

            spaces = 1;
            stars = number - 2;

            // Lower half of the diamond
            for (int i = number - 2; i >= 1; i -= 2) {
                for (int j = 0; j < spaces; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < stars; j++) {
                    System.out.print(i);
                }
                System.out.println();
                spaces++;
                stars -= 2;
            }
        scanner.close(); // Close the scanner
    }
}