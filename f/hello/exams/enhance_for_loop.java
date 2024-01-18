package Exams;

public class enhance_for_loop {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		int sum = 0;
		int sum_num = 0;
		
		for (int i:arr) {
			sum+=i;
		}
		System.out.println(sum);
		
		
		for (int i=0;i<arr.length;i++) {
			sum_num+=arr[i];
		}
		System.out.println(sum_num);
	}
}
