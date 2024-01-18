package Week_4_tutorial;

class my_pra {
	String Brand;
	int price;
	
	my_pra(String b, int p) {
		System.out.println("Brand: "+b);
		System.out.println("Price: "+p);
	}
}

public class constructor_1 {

	public static void main(String[] args) {
		my_pra p = new my_pra("Oppo",12000);
	}
}
