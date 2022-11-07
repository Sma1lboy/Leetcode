public class Sum_of_Root_To_Leaf_Binary_Numbers {
//    public int sumRootToLeaf(TreeNode root) {
//        return dfs(root, 0);
//
//    }
//    public int dfs(TreeNode root, int sum) {
//        if(root == null) return 0;
//
//        sum = (sum<<1) + root.val;
//
//        if(root.left == null && root.right == null) {
//            return sum;
//        }
//
//        return dfs(root.left, sum) + dfs(root.right, sum);
//    }
}
