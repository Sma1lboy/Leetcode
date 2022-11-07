public class Add_Two_Numbers {
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

//        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//            return addTwoNumbers(l1, l2, 0);
//        }
//
//        public ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
//            //base case if there is no more l1 and l2 and carry is 0
//            if(l1 == null && l2 == null && carry ==0) {
//                return null;
//            }
//            //get the val
//            int val1 = l1 == null ? 0 : l1.val;
//            int val2 = l2 == null ? 0 : l2.val;
//            //add together
//            int sum = val1 + val2 + carry;
//            //get carry
//            carry = sum / 10;
//            //check if it not null, go through next
//            l1 = l1 == null ? null : l1.next;
//            l2 = l2 == null ? null : l2.next;
//            //remove the carry and get next node
//            return new ListNode(sum % 10, addTwoNumbers(l1, l2, carry));
//        }

}
