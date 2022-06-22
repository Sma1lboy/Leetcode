public class Subtree_of_Another_Tree {
//    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
//        if(root == null) {
//            return subRoot == null;
//        }
//        return dfsSame(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
//    }
//    //Bottom to top dfs
//    public boolean dfsSame(TreeNode t1, TreeNode t2) {
//        if(t1 == null && t2 == null) return true;
//        if(t1 == null) return false;
//        if(t2 == null) return false;
//        if(t1.val != t2.val) return false;
//
//        return dfsSame(t1.left, t2.left) && dfsSame(t1.right, t2.right);
//    }
}
