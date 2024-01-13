package Exams;

public class Enhance_for_loop {

	public static void main(String[] args) {
		
	int array[] = {1,2,3,5,4,3,2};
	
	// Normal for loop
	for(int i=0;i<array.length;i++) {
		System.out.print(array[i]+", ");
		}
	
	//Enhance for loop
	for(int i:array) {
		System.out.print(i);
		}
	}
}
