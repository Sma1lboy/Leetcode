public class Min_Stack {
    /**
     * The reason why Min_Stack doesn't have default constructor.
     *
     * When you provide your own custom constructor java wont provide you default constructor.
     * This program will work until you create object with constructor with no args like when you do new Node()
     * this will not work as you have not supplied default constructor.
     */
    Node head;
    public void push(int val) {
        //TODO have to understand this
        if(head == null) {
            head = new Node(val, val, null);
        } else {
            head = new Node(val, Math.min(val, head.min), head);
        }
    }
    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
    class Node {
        int val;
        int min;
        Node next;
        public Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}
