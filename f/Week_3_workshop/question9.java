package Week_3_workshop;

public class question9 {

	public static void main(String[] args) {
		char[] arr = {'a','b','c','d','e','f','g','h', 'i', 'j', 'k', 'l', 'm', 'n','p','q','r','s','t','u'};
		int count = 0;
		for (char ch:arr) {
			if (ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u') {
				count++;
			}			
		}
		System.out.println(count);
	}

}
