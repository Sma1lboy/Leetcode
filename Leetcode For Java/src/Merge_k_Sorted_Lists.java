public class Merge_k_Sorted_Lists {
//    public ListNode mergeKLists(ListNode[] lists) {
//        return mergeSort(lists, 0, lists.length - 1);
//    }
//
//    public ListNode mergeSort(ListNode[] list, int l, int r) {
//        //check base case if the l equal to r, which is means list[l] and list[r] are same
//        if(l == r) {
//            return list[r];
//        }
//        if(l < r) {
//            //cut down the arr
//            int mid = l + (r - l) / 2;
//            //base case is makes every become single node and sort two single node
//            ListNode l1 = mergeSort(list, l, mid);
//            ListNode l2 = mergeSort(list, mid + 1, r);
//            //and return the sorted answer, which is the function we wrote on prev question.
//            return mergeList(l1, l2);
//        } else {
//            return null;
//        }
//    }
//    //the function is merge two list
//    public ListNode mergeList(ListNode l1, ListNode l2) {
//        if(l1 == null) return l2;
//        if(l2 ==null) return l1;
//        if(l1.val < l2.val) {
//            l1.next = mergeList(l1.next, l2);
//            return l1;
//        }
//        else {
//            l2.next = mergeList(l1, l2.next);
//            return l2;
//
//        }
//    }
}
