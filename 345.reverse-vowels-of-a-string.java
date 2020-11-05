import java.util.Arrays;
import java.util.HashSet;

/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {

		//新建一个集合来存储所有元音，contains()方法用于检测是否是元音
		HashSet<Character> vowels = new HashSet<Character>(
			Arrays.asList('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'));
		
		//新建一个char[]数组来存新的数组
		char[] result = new char[s.length()];
		
		//构建两个指针，一个前->后，一个后->前
		int i = 0;
		int j = s.length() - 1;

		//移动两边的指针来遍历判断是否是元音
		while (i <= j) {
			char ci = s.charAt(i);
			char cj = s.charAt(j);

			if (!vowels.contains(ci)) {
				result[i] = ci;
				i++;
			} else if (!vowels.contains(cj)) {
				result[j] = cj;
				j--;
			} else {
				result[i] = cj;
				i++;
				result[j] = ci;
				j--;
			}
		}
		return new String(result);
    }
}
// @lc code=end

