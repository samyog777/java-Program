package Exams;

import java.util.Scanner;

public class Even_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the number to check odd or evem: ");
		int num = Scan.nextInt();
		if (IsEven(num)) {
			System.out.println("It is even number!");
		} else {
			System.out.println("It is odd number!");
		}
		
		Scan.close();
	}
	public static boolean IsEven(int num){
		return num%2==0;
	}
}
