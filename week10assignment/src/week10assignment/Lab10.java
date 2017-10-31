/**
 * 
 */
package week10assignment;

/**
 * @author jgsha
 *
 */
public class Lab10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int first = 0;
		int second = 0;
		
		for (int x = 1000; x <= 9999; x++) {
			for (int y = 1000; y <= 9999; y++) {
				if (isaPalindrome(Integer.toString((x * y)))){
						first = x;
						second = y; 
					}
			}
		}

		System.out.println(first + " * " + second + " = " + (first*second));
	}

	public static boolean isaPalindrome(String input) {
		int length = input.length();
		
		if(input.equals("") || length == 1)
			return true;
		if(input.charAt(0) == input.charAt(length-1)) {
			if(length == 3)
				return true;
			return isaPalindrome(input.substring(1, (length-1)));
		}
		
		return false;
	}
}
