package Tutorial_6;

public class interface_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RayZr zr= new RayZr();
		zr.mileage();
		zr.model();
	}

}

interface Scooter{
	void mileage();
}
interface Brand{
	void model();
}
class RayZr implements Scooter,Brand{
	@Override
	public void mileage() {
		System.out.println("Max mileage of 55km/hr");
	}
	@Override
	public void model() {
		System.out.println("Modeled by Yamaha");
	}
}