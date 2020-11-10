/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

		// 定义一下合并后列表，原表1和表2的右边界
		int k = m + n - 1;
		int i = m - 1;
		int j = n -1;

		// 当两个列表均有元素时，从后向前遍历，开始比对
		while (i >= 0 && j >= 0){
			if (nums1[i] > nums2[j]) {
				nums1[k] = nums1[i];
				i--;
			} else {
				nums1[k] = nums2[j];
				j--;
			}
			k--;
		}

		// 当只剩列表1里有元素时，直接向前复制列表
		while (i >= 0) {
			nums1[k] = nums1[i];
			i--;
			k--;
		}

		// 当只剩列表2里有元素时，直接向前复制列表
		while (j >= 0) {
			nums1[k] = nums2[j];
			j--;
			k--;
		}
    }
}
// @lc code=end

