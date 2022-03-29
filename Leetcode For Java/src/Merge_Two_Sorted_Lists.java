//21
public class Merge_Two_Sorted_Lists {

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
//        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//            ListNode ans;
//            if(list1 == null) return list2;
//            if(list2 == null) return list1;
//            if (list1.val < list2.val) {
//                list1.next = mergeTwoLists(list1.next, list2);
//                ans = list1;
//            } else {
//                list2.next = mergeTwoLists(list1, list2.next);
//                ans = list2;
//            }
//            return ans;
//        }
//    }
}
