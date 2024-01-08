package Week_6_Workshop;

public class question_15 {

	public static void main(String[] args) {
		try {
			int[] age = {10,20,25,24,28,27,30,31,32};
			System.out.println(age[9]);
		} catch (Exception e) {
			System.out.println("Error: "+ e);
		}
	}
}

