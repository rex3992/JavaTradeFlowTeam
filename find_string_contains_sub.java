package Java_Prgms1;

public class find_string_contains_sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isSubString("Roshanali","ali"));
		
	}
	public static boolean isSubString(String main,String sub) {
		return main.matches("(.*)"+sub+"(.*)");
	}

}
