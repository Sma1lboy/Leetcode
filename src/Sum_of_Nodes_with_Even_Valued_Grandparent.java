public class Sum_of_Nodes_with_Even_Valued_Grandparent {
//    class Solution {
//        public int sumEvenGrandparent(TreeNode root) {
//            return dfs(root, null, null);
//        }
//        public int dfs(TreeNode root, TreeNode parent, TreeNode grandParent)  {
//            if(root == null) return 0;
//            int sum = 0;
//            if(grandParent != null && grandParent.val % 2 == 0) {
//                sum += root.val;
//            }
//            return dfs(root.left, root, parent) + dfs(root.right, root, parent) + sum;
//
//        }
//    }
}
