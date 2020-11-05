/*
 * @lc app=leetcode id=680 lang=java
 *
 * [680] Valid Palindrome II
 */

// @lc code=start
class Solution {
    public boolean validPalindrome(String s) {
		//头->尾，尾->头同时遍历逐一整个字符串

		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			//当出现不相等情况时，判断两种情况：
			//1.左指针向右移动一个，右指针不变
			//2. 右指针向左移动一个，左指针不变
			//当两种情况中任意一种为回文时，判定为回文
			if (s.charAt(i) != s.charAt(j)) {
				return isPalindrome(s, i+1, j) || isPalindrome(s, i, j-1);
			}
		}
		return true;
	}
	
	//写一个判断正常回文的方法，即一个 头->尾，一个尾->头，逐一比对，全都相等即为回文
	public boolean isPalindrome(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
// @lc code=end

