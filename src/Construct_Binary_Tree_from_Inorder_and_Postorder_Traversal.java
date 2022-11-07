public class Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {
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
//        public TreeNode buildTree(int[] inorder, int[] postorder) {
//            return build(inorder, 0, inorder.length - 1, postorder, 0, postorder.length- 1);
//        }
//        public TreeNode build(int[] inorder, int inS, int inE, int[] postorder, int posS, int posE) {
//            //base case if there is no leaf, return null
//            if(inS > inE || posS > posE) {
//                return null;
//            }
//
//            //mark the root, last index of postorder
//            TreeNode root = new TreeNode(postorder[posE]);
//            //find the root value index in inorder array
//            int rootIndex = 0;
//            for(int i = 0; i < inorder.length; i++) {
//                if(inorder[i] == root.val) {
//                    rootIndex = i;
//                    break;
//                }
//            }
//            //after we find we know which is left subtree which is right subtree
//            root.left = build(inorder, inS, rootIndex - 1, postorder, posS, posS + rootIndex-inS - 1);
//            root.right = build(inorder, rootIndex + 1, inE, postorder, posS+rootIndex-inS,posE-1);
//            return root;
//        }
//    }
}
