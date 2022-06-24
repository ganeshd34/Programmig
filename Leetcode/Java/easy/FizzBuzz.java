import java.util.ArrayList;
import java.util.List;

/*
 * https://leetcode.com/problems/fizz-buzz/
 */
public class FizzBuzz {
	public List<String> fizzBuzz(int n) {
		List<String> answer = new ArrayList<>();
		String val;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				val = "FizzBuzz";
			} else if (i % 3 == 0) {
				val = "Fizz";
			} else if (i % 5 == 0) {
				val = "Buzz";
			} else {
				val = i + "";
			}
			answer.add(val);
		}
		return answer;
	}
}
