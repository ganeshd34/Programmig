/*
 * https://leetcode.com/problems/palindrome-linked-list/
 */
public class PalindromeLinkedList {
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {
		}
		ListNode(int val) {
			this.val = val;
		}
		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public boolean isPalindrome(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		// find mid
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		
		// reverse slow
		ListNode cur = slow;
		ListNode prev = null;
		while (cur != null) {
			ListNode nxt = cur.next;
			cur.next = prev;
			prev = cur;
			cur = nxt;
		}
		slow = prev;

		// compare
		while (slow != null) {
			if (slow.val != head.val) {
				return false;
			}
			head = head.next;
			slow = slow.next;
		}
		return true;
	}
}
