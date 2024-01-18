package Exams;

public class book {
	private String auther;
	private int price;
	private String production_house;
	private String genre;

	public book(String auther,int price, String production_house, String genre) {
		this.auther = auther;
		this.price = price;
		this.production_house = production_house;
		this.genre = genre;
	}

	public String getauther() {
		return auther;
	}
	public int getprice() {
		return price;
	}
	public String getproduction_house() {
		return production_house;
	}
	public String getgenre() {
		return genre;
	}
	public void setauther(String auther) {
		this.auther = auther;
	}
	public void setprice(int price) {
		this.price = price;
	}
	public void setproduction_house(String production_house) {
		this.production_house = production_house;
	}
	public void setgenre(String genre) {
		this.genre = genre;
	}
	
	public static void main(String[] args) {
		book b = new book("Laws of power",2000,"Sbooks","fiction");
		
		System.out.println("Author: "+b.getauther());
		System.out.println("Price: $"+b.getprice());
		System.out.println("ProductionHouse: "+b.getproduction_house());
		System.out.println("Genre: "+b.getgenre());
	
		b.setauther("Power");
		b.setprice(200);
		b.setproduction_house("S_product");
		b.setgenre("fantacy");
		
		System.out.println();
		System.out.println("Author: "+b.getauther());
		System.out.println("Price: $"+b.getprice());
		System.out.println("ProductionHouse: "+b.getproduction_house());
		System.out.println("Genre: "+b.getgenre());
	}
}

