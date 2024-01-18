package Week_6_Workshop;

public class question_14 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (Exception e){
			System.out.println("Error: "+e);
		}
	}
}

