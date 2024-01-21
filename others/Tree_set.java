package All_java_program;
import java.util.*;

public class Tree_set {

	public static void main(String[] args) {
		TreeSet<Integer> hs = new TreeSet<> ();  // Auto use most of the function like sort and remove duplicate data
		hs.add(2);
		hs.add(3);
		hs.add(2);
		hs.add(266);
		hs.add(42);
		hs.add(54);
		System.out.println(hs.contains(2));
		System.out.println(hs);
		
	}

}
