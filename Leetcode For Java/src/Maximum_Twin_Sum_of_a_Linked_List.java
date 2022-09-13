// /**
//  * @author Jackson Chen
//  * @version 1.0
//  * @date 2022/9/7
//  */
// public class Maximum_Twin_Sum_of_a_Linked_List {
//
//     public static int pairSum(ListNode head) {
//
//         ListNode fast = head, slow = head;
//
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         // get middle pointer
//         // reverse it
//         slow = reverse(slow);
//         // reset the another pointer a hea
//         fast = head;
//         // now keep track the max value until the slow pointer is null
//         int max = Integer.MIN_VALUE;
//         while (slow != null) {
//             max = Math.max(max, slow.val + fast.val);
//             slow = slow.next;
//             fast = fast.next;
//         }
//         return max;
//     }
//
//     private static ListNode reverse(ListNode node) {
//         ListNode curr = node;
//         ListNode prev = null;
//
//         while (curr == null) {
//             ListNode next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         return prev;
//     }
//
// }
