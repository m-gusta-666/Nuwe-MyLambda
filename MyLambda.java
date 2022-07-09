package repte2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MyLambda {


	
	// We code our checking functions by instancing the functional interface
	// CheckNumber and implementing its method 'check' with lambda expressions
	
	// All of them must return 'false' when receiving a number not greater than 0
	
	static CheckNumber isOdd = num -> {
		if (num <= 0) {
			return false;
		} else {
			return num % 2 == 0;
		}
	};

	static CheckNumber isPrime = num -> {
		if (num <= 0) {
			return false;
		} else {
			boolean prime = true;
			int i = 2;
			while (prime && i <= num / 2) {
				if (num % i == 0) {
					prime = false;
				} else {
					i++;
				}
			}
			return prime;
		}
	};

	static CheckNumber isPalindrome = num -> {
		if (num <= 0) {
			return false;
		} else {
			int reverse = 0, res = 0, num2 = num;
			do {
				res = num2 % 10;
				reverse = reverse * 10 + res;
				num2 = num2 / 10;
			} while (num2 != 0);
			return reverse == num;
		}
	};


	public static List<Map<String, Object>> checker(Integer[] nums) {

		// We create an arraylist in which we'll be adding the results
		// for each number received in the array
		List<Map<String, Object>> output = new ArrayList<Map<String, Object>>();

		
		
		Arrays.asList(nums)  // We convert the array to a list so that we can use Stream
			  .stream()
			  .forEach(num -> {  // For each number, we create a map to generate the output
			Map<String, Object> map = new LinkedHashMap<String, Object>();
			
			// As asked, we evaluate separately the case where the number is 0.
			if (num == 0) {
				map.put("NOT A POSSIBLE OPTION", 0);
				
			// Otherwise, we generate our map by calling the check() function using
			// the instances created before
			} else {
				map.put("input", num);
				map.put("isOdd", isOdd.check(num));
				map.put("isPrime", isPrime.check(num));
				map.put("isPalindrome", isPalindrome.check(num));
			}
			
			// Finally, we add the map for this number to the output list
			output.add(map);
		});
		return output;
	}
	
	
}
