package Week_4_workshop;
import java.util.Scanner;

class lamp {
	boolean isOn;
	void turnOn() {
		boolean isOn = true;
		System.out.println("Turned On");
	}
	void turnOff() {
		boolean isOn = false;
		System.out.println("Turned Off");
	}
}

public class question4 {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
//		boolean isOn = false;
		
		System.out.println("Enter the condition: ");
		boolean isOn = Scan.nextBoolean();
		
		lamp l = new lamp();
		if (isOn == true) {
			l.turnOn();
		}
		else {
			l.turnOff();
		}
		Scan.close();
	}
}
