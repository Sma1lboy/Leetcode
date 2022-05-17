public class Symmetric_Tree {
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
//        public boolean isSymmetric(TreeNode root) {
//            return isSame(root.left, root.right);
//        }
//        public boolean isSame(TreeNode l, TreeNode r) {
//            if(l == null || r == null) {
//                return l == r;
//            }
//
//            return isSame(l.left, r.right) && isSame(l.right, r.left) && l.val == r.val;
//        }
//    }
}
