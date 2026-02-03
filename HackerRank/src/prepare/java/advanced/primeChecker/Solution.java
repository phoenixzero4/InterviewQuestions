package prepare.java.advanced.primeChecker;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;




public class Solution {
	 static List<Integer> list = new ArrayList<>();
	class Prime {

		
		
		

		public List<Integer> checkPrime(int... x) {

			
			list = new ArrayList<>();

			for (int i = 0; i < x.length; i++) {
				boolean prime = true;
				int num = x[i];

				if (num < 2 || (num % 2 == 0 && num != 2)) {
					prime = false;
				} else if (num == 2) {
					prime = true;

				} else {

					for (int j = 3; j <= Math.sqrt(num); j += 2) {
						if (num % j == 0) {
							prime = false;
							break;
						}
					}
			
				}		if (prime) {
					list.add(num);
				
				}
				
			}
			return list;

		}
	}

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int n1 = Integer.parseInt(br.readLine());
			int n2 = Integer.parseInt(br.readLine());
			int n3 = Integer.parseInt(br.readLine());
			int n4 = Integer.parseInt(br.readLine());
			int n5 = Integer.parseInt(br.readLine());

			Solution s = new Solution();
			Prime ob =  s.new Prime();

			//List<Integer> list = ob.list;

			list = ob.checkPrime(n1);
			
			for(Integer i : list) {
				System.out.print(i + " ");
			}
			System.out.println();
			
			
			list = ob.checkPrime(n1, n2);
			for(Integer i : list) {
				System.out.print(i + " ");			
			}
			System.out.println();
			
			list = ob.checkPrime(n1, n2, n3);
			for(Integer i : list) {
				System.out.print(i + " ");		
			}
			System.out.println();
			
			
			list = ob.checkPrime(n1, n2, n3, n4, n5);
			for(Integer i : list) {
				System.out.print(i + " ");		
			}
			System.out.println();
			
			Method[] methods = Prime.class.getDeclaredMethods();
			Set<String> set = new HashSet<>();
			boolean overload = false;

			for (int i = 0; i < methods.length; i++) {
				if (set.contains(methods[i].getName())) {
					overload = true;
					break;
				}
				set.add(methods[i].getName());
			}

			if (overload) {
				throw new Exception("Overloading not allowed");
			}

			br.close();
			// System.out.println(list);

		} catch (Exception e) {
			System.out.println(e);

		}
	}
}
