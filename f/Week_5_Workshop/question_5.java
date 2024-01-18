package Week_5_Workshop;

public class question_5 {

	public static void main(String[] args) {
		Parent p = new Parent("private","protected");
		p.variable="public";
		p.showDetails();
	}

}

class Parent{
	public String variable;
	private String variable1;
	protected String variable2;
	
	public Parent(String variable1, String variable2) {
		this.variable1 = variable1;
		this.variable2 = variable2;
	}
	
	public void showDetails() {
		System.out.println("Public "+variable);
		System.out.println("Private "+variable1);
		System.out.println("Protected "+variable2);
	}
}
