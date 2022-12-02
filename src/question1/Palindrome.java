package question1;

public class Palindrome {

	public static void main(String[] args) {

		// variables for answer
		int longest_pal = 0;
		int longest_pals_num = 0;

		// Loop for finding the longest palindrome
		for (int number = 10; number <= 100; number++) {

			int tmpNumber = number;
			int rNumber = reverseNum(tmpNumber);

			// Is tmpNumber palindrome
			while (tmpNumber != rNumber) {
				tmpNumber += rNumber;
				rNumber = reverseNum(tmpNumber);
			}

			// Is palindrome longer than longest
			if (longest_pal < tmpNumber) {
				longest_pal = tmpNumber;
				longest_pals_num = number;
			}

		}

		// Print Longest palindrome and number which has it
		System.out.println("Longest Chain = " + longest_pal + "\nNumber = " + longest_pals_num);

	}

	// Returns reversed number
	public static int reverseNum(int num) {
		int reverse = 0;
		while (num != 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		return reverse;
	}

}
