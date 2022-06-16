/*
 * https://leetcode.com/problems/ransom-note/
 */
public class RansomNote {
	public static void main(String[] arg) {
		System.out.println(canConstruct("a", "b"));
		System.out.println(canConstruct("aa", "ab"));
		System.out.println(canConstruct("aa", "aab"));
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote.length() > magazine.length())
			return false;

		int[] countArr = new int[26];

		int i = 0;
		while (i < ransomNote.length()) {
			int mPos = getPosition(magazine.charAt(i));
			countArr[mPos] = countArr[mPos] + 1;

			int rPos = getPosition(ransomNote.charAt(i));
			countArr[rPos] = countArr[rPos] - 1;

			i++;
		}

		while (i < magazine.length()) {
			int mPos = getPosition(magazine.charAt(i));
			countArr[mPos] = countArr[mPos] + 1;
			i++;
		}
		for (int j = 0; j < 26; j++) {
			if (countArr[j] < 0)
				return false;
		}
		return true;
	}

	public static int getPosition(char c) {
		return c - 'a';
	}
}
