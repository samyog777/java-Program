package workshop_6;

import  java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ragex {

	public static void main(String[] args) {
		// \\w == a-z, A-Z, 0-9, _ ;
		// \\w+ == multiple \\w ;
		// \\w* == 0 and more ;
		// \\w? == 0 and 1 ;
		// \\W == except w;
		
		// \\d == 0-9 ;
		// \\D == except d or number;
		
		// \\s == (blank!);
		// \\S == 
		
		// For manual: User + to add 2 condition or element
		// [a-zA-Z0-9]+ == Atleast one of the big bracket;
		// [a-zA-Z0-9] == for one in side of the bracket;
		// [a-zA-Z0-9]{5} == As defined in the bracket for 5 times;

		String regex = "[a-z0-9.]+[@]+[a-z]{5}+[.]+[a-z]{3}";
		Pattern p = Pattern.compile(regex);
		
		String userInput = "samyog.koirala18@gmail.com";
		Matcher m = p.matcher(userInput);
		
		boolean result = m.matches();
		System.out.println(result);
	}
}
