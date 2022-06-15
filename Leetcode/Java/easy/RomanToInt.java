/*
 * https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInt {
	public static void main(String[] arg) {
		System.out.println(romanToInt("III"));// output: 3
		System.out.println(romanToInt("LVIII"));// output: 58
		long s = System.currentTimeMillis();
		System.out.println(romanToInt("MCMXCIV"));// output: 1994
		long e = System.currentTimeMillis();
		System.out.println(e - s);
	}

	public static int romanToInt(String s) {
		int sum = 0;
		int i = 0;
		while (i < s.length()) {
			if (s.charAt(i) == 'M')
				sum = sum + 1000;
			if (s.charAt(i) == 'D')
				sum = sum + 500;
			if (s.charAt(i) == 'L')
				sum = sum + 50;
			if (s.charAt(i) == 'V')
				sum = sum + 5;
			if (s.charAt(i) == 'C') {
				if ((i + 1) < s.length() && s.charAt(i + 1) == 'M') {
					sum = sum + 900;
					i++;
				} else if ((i + 1) < s.length() && s.charAt(i + 1) == 'D') {
					sum = sum + 400;
					i++;
				} else {
					sum = sum + 100;
				}
			}
			if (s.charAt(i) == 'X') {
				if ((i + 1) < s.length() && s.charAt(i + 1) == 'C') {
					sum = sum + 90;
					i++;
				} else if ((i + 1) < s.length() && s.charAt(i + 1) == 'L') {
					sum = sum + 40;
					i++;
				} else {
					sum = sum + 10;
				}
			}
			if (s.charAt(i) == 'I') {
				if ((i + 1) < s.length() && s.charAt(i + 1) == 'X') {
					sum = sum + 9;
					i++;
				} else if ((i + 1) < s.length() && s.charAt(i + 1) == 'V') {
					sum = sum + 4;
					i++;
				} else {
					sum = sum + 1;
				}
			}
			i++;
		}
		return sum;
	}
}
