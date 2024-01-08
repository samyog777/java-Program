package Week_3_workshop;

public class question11 {

	public static void main(String[] args) {
		int[][] array2D = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		int sum = 0;
		for (int[] row : array2D) {
			for (int value : row) {
				sum += value;
			}
		}
		System.out.println("The sum of all element in the 2D array is: " + sum);
	}

}
