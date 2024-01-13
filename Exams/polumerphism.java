package Exams;

public class polumerphism {

	public static void main(String[] args) {
		 PLanguage pl = new PLanguage();
	        pl.display();

	        pl = new JavaLanguage();
	        pl.display();
	}
	
	 static class PLanguage {
	        public void display() {
	            System.out.println("I am a programming language.");
	        }
	    }
	
	static class JavaLanguage extends PLanguage {
        public void display() {
            System.out.println("I am an object-oriented programming language.");
        }
    }
}
