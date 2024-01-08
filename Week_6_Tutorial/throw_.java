package Tutorial_6;

public class throw_ {

	public static void main(String[] args) {
//		int message = 123;
//		if (message > 14) 
//			throw new ArithmeticException("Wrong");
//		else 
//			System.out.println("Wellcome!!");
		throw_ t = new throw_();
		try {
			t.check();
		} catch(ArithmeticException e) {
			System.out.println("Caught"+e);
		}
	}

	public void check() throws ArithmeticException{
		System.out.println("Checking!!");
		throw new ArithmeticException("HI");
	}
}

