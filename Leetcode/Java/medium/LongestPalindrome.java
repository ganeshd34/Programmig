/*
 * https://leetcode.com/problems/longest-palindromic-substring/
 */
public class LongestPalindrome {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("babad"));
		System.out.println(longestPalindrome("cbbd"));
		System.out.println(longestPalindrome("cbbc"));
	}

	public static String longestPalindrome(String s) {
		boolean[][] a = new boolean[s.length()][s.length()];
		int iL = 0;
		int jL = 0;
		//i & j represents start and end index of the substring
		for (int i = s.length() - 1; i >= 0; i--) {
			for (int j = i; j < s.length(); j++) {
				if (i == j)
					a[i][j] = true;
				else if (s.charAt(i) != s.charAt(j))
					a[i][j] = false;
				else if (i <= (j - 2))
					a[i][j] = a[i + 1][j - 1];
				else
					a[i][j] = true;

				if (a[i][j] && (j - i) > (jL - iL)) {
					iL = i;
					jL = j;
				}
			}
		}
		return s.substring(iL, jL + 1);
	}
}
