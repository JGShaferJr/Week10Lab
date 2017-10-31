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
		
		int fibSum = fibonacci();
		
		System.out.println(fibSum);
	}

	private static int fibonacci() {
		int prev = 0;
		int curr = 1;
		int temp = 0;
		int total = 0;
		
		while(curr < 2000000000) {
			if((curr % 2) == 1)
				total += curr;
			
			temp = curr;
			curr += prev;
			prev = temp;
		}

		return total;
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
