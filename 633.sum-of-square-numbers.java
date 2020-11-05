/*
 * @lc app=leetcode id=633 lang=java
 *
 * [633] Sum of Square Numbers
 */

// @lc code=start
class Solution {
    public boolean judgeSquareSum(int c) {
		//初始化返回值为false
		boolean result = false;
		
		//构建两个指针，下界为0，上界为<输入值的平方根
		int i = 0;
		int j = (int) Math.sqrt(c);

		//判断两指针值的平方和与给定值，小于时左指针右移，大于时右指针左移
		while (i <= j) {
			int pow = i*i + j*j;
			if (pow == c) {
				result = true;
				return result;
			} else if (pow > c) {
				j--;
			} else {
				i++;
			}
		}
		return result;
    }
}
// @lc code=end

