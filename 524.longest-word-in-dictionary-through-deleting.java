import javax.naming.spi.DirStateFactory.Result;

/*
 * @lc app=leetcode id=524 lang=java
 *
 * [524] Longest Word in Dictionary through Deleting
 */

// @lc code=start
class Solution {
    public String findLongestWord(String s, List<String> d) {
		// 初始化一个字符串保存结果
		String result = "";
		
		// 遍历d列表中当个元素
		for (String t:d) {
			// 比较当前字符与结果字符
			if (result.length() < t.length() || (result.length() == t.length() && result.compareTo(t) > 0)) {
				if (isSubstr(t, s)) {
					result = t;
				}
			}
		}
		return result;
	}

	// 构造一个判断是否为子字符串的函数
	private boolean isSubstr(String t, String s) {
		int i = 0;
		int j = 0;

		// 两个指针逐个遍历，i向右，当相等时j向右
		while (i < s.length() && j < t.length()) {
			if (s.charAt(i) == t.charAt(j)) {
				j++;
			}
			i++;
		}

		// 判断字符串长度是否相等
		return j == t.length();
	}
}
// @lc code=end

