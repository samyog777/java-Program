package Exams;

public class exception_and_error {
	public static void main(String[] args) {
		int result = divide(10,0);
		try {
			System.out.println(result);
		} catch (ArithmeticException e){
			System.out.println("Error: "+e);
		}
	}
	
	public static int divide(int a, int b) throws ArithmeticException{
		if (b == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		} else {
			return a/b;
		}
	}
}