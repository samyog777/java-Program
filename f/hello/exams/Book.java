package Exams;

public class Book {
	private String Name;
	private int age;
	private String genre;
	private int price;
	
	Book(String Name, int Age, String genre, int price) {
		this.Name = Name;
		this.age = age;
		this.genre = genre;
		this.price = price;
	}
	
		public String getName() {
			return Name;
		}
		
		public int getAge() {
			return age;
		}
		
		public String getGenre() {
			return genre;	
		}
		
		public int getPrice() {
			return price;
		}
		
		public void setName(String Name) {
			this.Name = Name;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public void setGenre(String genre) {
			this.genre = genre;
		}
		
		public void setPrice(int price) {
			this.price = price;
		}
		
		public static void main(String[] args) {
			Book b = new Book("Samyog",19,"Realiity",109);
			
			System.out.println("Name" +b.getName());
			System.out.println("Age" +b.getAge());
			System.out.println("genre" +b.getGenre());
			System.out.println("price" +b.getPrice());
			
			b.setName("Vex");
			b.setAge(19);
			b.setGenre("real");
			b.setPrice(100);
			System.out.println();
			System.out.println("Name" +b.getName());
			System.out.println("Age" +b.getAge());
			System.out.println("genre" +b.getGenre());
			System.out.println("price" +b.getPrice());
	}
}
