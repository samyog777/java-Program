package Week_4_workshop;

public class question11 {

	public static void main(String[] args) {
		bankaccount first_scenerio = new bankaccount("ram", 76777);
		bankaccount second_scenerio = new bankaccount("shyam", 66363);
		
		System.out.println("First Scenerio name and accountnumber: " + first_scenerio);
		System.out.println("Second Scenerio name and accountnumber: " + second_scenerio);

	}
}


class bankaccount{
	String name;
	int accountno;
	
	public bankaccount(String name, int accountno) {
		this.name = name;
		this.accountno = accountno;
	}
	
	 public String toString() {
	        return "Name: " + name + ", Account Number: " + accountno;
	    }
}
