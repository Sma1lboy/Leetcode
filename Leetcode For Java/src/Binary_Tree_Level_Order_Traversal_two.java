public class Binary_Tree_Level_Order_Traversal_two {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
//    class Solution {
//        public List<List<Integer>> levelOrderBottom(TreeNode root) {
//            //res list
//            List<List<Integer>> list = new ArrayList<>();
//            //base case check
//            if(root == null) {
//                return list;
//            }
//            //BFS version
//            Queue<TreeNode> q = new LinkedList<>();
//            q.offer(root);
//            while(!q.isEmpty()) {
//                int size = q.size();
//                //create a sublist to store same level val
//                List<Integer> sublist = new ArrayList<>();
//                for(int i = 0; i < size; i++) {
//                    //post order
//                    if(q.peek().left != null) {
//                        q.offer(q.peek().left);
//                    }
//                    if(q.peek().right != null) {
//                        q.offer(q.peek().right);
//                    }
//                    sublist.add(q.poll().val);
//                }
//                list.add(0, sublist);
//            }
//            return list;
//        }
//    }
}
