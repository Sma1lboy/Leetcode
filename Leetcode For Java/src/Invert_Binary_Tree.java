public class Invert_Binary_Tree {
//    /**
//     * Definition for a binary tree node.
//     * public class TreeNode {
//     *     int val;
//     *     TreeNode left;
//     *     TreeNode right;
//     *     TreeNode() {}
//     *     TreeNode(int val) { this.val = val; }
//     *     TreeNode(int val, TreeNode left, TreeNode right) {
//     *         this.val = val;
//     *         this.left = left;
//     *         this.right = right;
//     *     }
//     * }
//     */
//    class Solution {
//
//        //thinking dfs and invert pre order or inorder, whatever
//        public TreeNode invertTree(TreeNode root) {
//            //base case
//            if(root == null) {
//                return null;
//            }
//            TreeNode left = invertTree(root.left);
//            TreeNode right = invertTree(root.right);
//            root.left = right;
//            root.right = left;
//            return root;
//        }
//    }
}
