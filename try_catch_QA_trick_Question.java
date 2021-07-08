package Java_Prgms1;

public class try_catch_QA_trick_Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		temp();
	}
	public static boolean temp() {
		try {
			System.out.println("try");
			return true;
		}
		catch(Exception e) {
			System.out.println("catch");
			return true;
		}
		finally {
			System.out.println("finally");
		}
	}

}
