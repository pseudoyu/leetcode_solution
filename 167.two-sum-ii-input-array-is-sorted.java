import sun.security.util.Length;

/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input array is sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
		
		//构建存储结果的数组
		int[] result = new int[2];
		
		//构建两个指针，一个从前往后，一个从后往前
		int i = 0;
		int j = numbers.length - 1;

		//循环直至相逢
		while (i < j) {
			//两个指针数值相加
			int sum = numbers[i] + numbers[j];

			//判断两数大小，相等则返回结果，小于目标值则小指针向右移动以为，大于目标值则大指针向左移动一位
			if (sum == target) {
				result[0] = i + 1;
				result[1] = j + 1;
				return result;
			} else if (sum < target) {
				i++;
			} else {
				j--;
			}
		}
		return result;
    }
}
// @lc code=end

