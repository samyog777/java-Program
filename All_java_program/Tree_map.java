package All_java_program;
import java.util.*;

public class Tree_map {

	public static void main(String[] args) {
		TreeMap <Integer,String> hm = new TreeMap<> ();
		hm.put(2, "Sammyog");
		hm.put(1, "Avi");
		System.out.println(hm);
		for(int key: hm.keySet()) {
			System.out.println(key);
		}
		for(String value: hm.values()) {
			System.out.println(value);
		}
		for(Map.Entry <Integer, String> e: hm.entrySet()) {
			System.out.println(e);
//			System.out.println(e.getKey());
//			System.out.println(e.getValue());
		}
	}

}
