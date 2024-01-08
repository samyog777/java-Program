package Tutorial_6;

//public class exception {
//
//	public static void main(String[] args) {
//		int x = 10;
//		int y = 0;
//		float divide = x/y;
//		System.out.println(divide);
//		System.out.println("Hello");
//	}
//}

public class exception {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		try {
			float divide = x/y;
			System.out.println(divide);
		} catch (ArithmeticException e) {
			System.out.println("Error occor: "+e);
		} finally {
			System.out.println("This is the use of finally in exception!!");
		}
		
		System.out.println("Hello");
	}
}

