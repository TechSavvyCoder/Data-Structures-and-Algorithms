package question5;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("7 * 4 = " + multiply(7, 4));
		System.out.println("*, 5 = " + displayRowOfCharacters("*", 5));
	}
	
	public static int multiply (int x, int y) {
		if(x == 0) {
			return 0;
		}
		
		return y + multiply(x-1, y);
	}

	public static String displayRowOfCharacters(String text, int count) {
		if(count == 0) {
			return "";
		}
		
		return text + "" + displayRowOfCharacters(text, count - 1);
	}
}
