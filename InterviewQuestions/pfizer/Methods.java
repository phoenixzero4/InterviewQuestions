package pfizer;

import java.util.function.Predicate;

public class Methods {

	public static long timeTest(Runnable action) {
		long start = System.nanoTime();
		//isPrime(value);
		try {
			action.run();
		}catch(Exception e) {
			e.getCause();
		}
		long end = System.nanoTime();
		long duration = end - start;
		
		return duration / 1_000_000;
	}
}
