package pfizer;
 


public class Pfizer {

	// write code to find if a number is prime
	static int count = 0;
	
	public static boolean isPrime(int number) {
		boolean isPrime = true;
		
		/* check for numbers less than or equal to 1 (special cases = not prime)
		 * then check if number is 2 (special case = is prime)
		 * then check if number is divisible by numbers from 3 to the square root of
		 * the number, skipping even numbers
		 * 
		 * Time complexity = O(sqrt(n))
		 */
		
		if(number <= 1 || number % 2 == 0) return false;
		if(number == 2) return true;
		
		for(int i = 3; i <= Math.sqrt(number); i+=2) {
			
			if(number % i == 0) {
				return false;
			}
		}
		count++;
		System.err.println(number + " is prime");
		return isPrime;
	}
	
	
	public static void main(String[] args) {
		 
		int bound = 100;
		
	
		
		for(int i = 3; i < bound; i+=2) {
			
			isPrime(i);
		}
		System.out.println("number of primes from 3 to " + bound + " = " + count);

		

		

	}

}
