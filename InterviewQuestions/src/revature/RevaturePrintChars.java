package revature;
/**
 * Coding question asked by Revature during technical interview on 22 Jan. 2026
 */

public class RevaturePrintChars {

	public static void main(String[] args) {

		char[] array = { 'A', 'B', 'C', 'D', 'E', 'F', 'E', 'D', 'C', 'B', 'A' };
		int length = array.length-1;
		
		
		// iterate over the char array and get the ascii code for each character
		for (int i = 0; i <= length; i++) {
			int charNumber = array[i];

			// determine which position we want to print each character
			int endPosition = charNumber % length;
			int beginPosition = length - endPosition;

			// print characters at the desired position otherwise print whitespace
			for (int j = 0; j <= length; j++) {
				if (beginPosition + endPosition == length && (j == beginPosition || j == endPosition)) {
					System.out.print(array[i]);
				} else {
					System.out.print(' ');
				}
			}
			// insert newline after each new array element
			System.out.println();

		}

	}

}
