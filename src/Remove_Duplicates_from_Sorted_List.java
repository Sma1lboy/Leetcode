public class Remove_Duplicates_from_Sorted_List {
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
//    class Solution {
//        public ListNode deleteDuplicates(ListNode head) {
//
//            ListNode res = head;
//            if(res == null || res.next == null) return head;
//            while(res.next != null) {
//                if(res.val == res.next.val) {
//                    res.next = res.next.next;
//                    continue;
//                }
//                res = res.next;
//            }
//            return head;
//        }
//    }
}
