/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
		//判断链表表头，若为空则一定不存在环
		if (head == null) {
			return false;
		}

		//构建两个指针，指向第一第二两个元素
		ListNode p = head; 
		ListNode q = head.next;

		//开始在循环中遍历两个指针，一个步长为1，一个步长为2，判断是否会相等
		while (p != null && q != null && q.next != null) {
			if (p == q) {
				return true;
			}
			p = p.next;
			q = q.next.next;
		}
		return false;
    }
}
// @lc code=end

