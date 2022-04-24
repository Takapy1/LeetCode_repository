/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }
        prev.next = list1 == null ? list2 : list1;

        return prehead.next;

        // ListNode ans = new ListNode();
        // // int[] ans = new int[100];
        // int i1, i2 = 0;
        // ListNode current_list1 = list1;
        // ListNode current_list2 = list2;


        // while (current_list1 != null && current_list2 != null) {
        //     if (current_list1.val < current_list2.val) {
        //         ans[i] = current_list1.val;
        //         current_list1 = current_list1.next;
        //     } else {
        //         ans[i] = current_list2.val;
        //         current_list2 = current_list2.next;
        //     }
        // }
        // return ans;
    }
}