package Week_3_workshop;

public class question6 {
	public static void main(String[] args) {

		double[] number = {2.5,3.5,2.7,5.7};
		double sum = 0;
		
		
		for (int i=0;i<number.length;i++) {
			sum+=number[i];
		}
		System.out.println(sum);
		double average = sum /number.length;
		System.out.println(average);
	}

}
