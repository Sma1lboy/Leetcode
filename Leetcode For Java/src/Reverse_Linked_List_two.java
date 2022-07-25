public class Reverse_Linked_List_two {
      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode result = new ListNode();
        result.next = head;
        ListNode prev = result;
        ListNode curr = prev.next;
        int i = 1;
        while(i < left) {
            prev = prev.next;
            curr = curr.next;
            i++;
        }
        //when we current node reach the left pointer
        //save pointer at left - 1
        ListNode node = prev;
        while(i <= right) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            i++;
        }
        //after we dont he inner reverse
        //wehave to re set the pointer of the linklist
        node.next.next = curr;
        node.next = prev;
        return result.next;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
        ListNode res = reverseBetween(list, 2, 4);

    }
}
