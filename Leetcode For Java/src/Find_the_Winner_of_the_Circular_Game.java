public class Find_the_Winner_of_the_Circular_Game {
//    public int findTheWinner(int n, int k) {
//        return helper(n,k)+1;
//    }
//    public int helper(int n,int k){
//        if(n==1) {
//            return 0;
//        } else {
//            return (helper(n-1,k)+k)%n;
//        }
//    }
    class Node {
        int val;
        Node prev;  
        Node next;
        Node (int val) {
            this.val = val;
        }
        public void kill() {
            prev.next = next;
            next.prev = prev;

        }
    }

}
