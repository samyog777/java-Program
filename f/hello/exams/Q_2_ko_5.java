package Exams;

public class Q_2_ko_5 {

	public static void main(String[] args) {
		for (int i=0;i<10;i++) {
			for (int j=0;j<2;j++) {
				if (i%2 ==0)
					continue;
				System.out.println(j);
			}
		}
	}

}

// if int was given in j:
//Output:

//0
//1
//0
//1
//0
//1
//0
//1
//0
//1
