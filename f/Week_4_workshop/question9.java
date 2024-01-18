package Week_4_workshop;

public class question9 {

	public static void main(String[] args) {
		Address a = new Address();
		a.setStreet("GhostTown");
		a.setCity("Z-City");
		a.setCity(4600);
		String city = a.getCity();
		String street = a.getStreet();
		int zipCode = a.GetZipCode();
		System.out.println("The city you want to visit is: city: "+city+" Street: "+street+" ZipCode: "+zipCode);
	}
}

class Address{
	private String street;
	private String city;
	private int zipCode;
	
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setCity(int zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public int GetZipCode() {
		return zipCode;
	}
}