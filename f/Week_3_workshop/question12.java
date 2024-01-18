package Week_3_workshop;

public class question12 {

	public static void main(String[] args) {
		String[] stringArray = {"Hello", " ", "World", "!", "Welcome"," ","to"," ","java"};
		StringBuilder concatenatedString = new StringBuilder();
		for (String str : stringArray) {
			concatenatedString.append(str);
		}
		
		System.out.println("Concatenated String: "+concatenatedString.toString());

	}

}
