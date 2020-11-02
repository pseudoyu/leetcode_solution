import java.util.HashMap;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //初始化存储结果的数组
        int[] result = new int[2];

        //初始化一个存放(值, 索引）的HashMap
        HashMap<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        
        //前->后遍历nums数组
        for (int i = 0; i < nums.length; i++) {


            //第一个数由循环遍历生成，求出要达成条件的另外一个数的值
            int remainNum = target - nums[i];
            
            //当找到了另一个数时，求出这个键的值（即索引）
            if (numsMap.containsKey(remainNum)) {
                result[0] = numsMap.get(remainNum);
                result[1] = i;
                return result; 
            }
            
            //将nums数组的值和索引一一对应放到numsMap里
            numsMap.put(nums[i], i);
        }
        return result;
    }
}
// @lc code=end

