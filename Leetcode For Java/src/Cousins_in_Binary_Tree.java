public class Cousins_in_Binary_Tree {
//    //save level
//    int height = 0;
//    //save parent to check
//    TreeNode saveParent = null;
//    public boolean isCousins(TreeNode root, int x, int y) {
//        return isCounsinss(root, x, y,0, null);
//    }
//    public boolean isCounsinss(TreeNode root, int x, int y, int level, TreeNode parent) {
//        //base case
//        if(root.val == x || root.val == y) {
//            if(saveParent != null && saveParent != parent && height == level) {
//                return true;
//            }
//
//            height = level;
//            saveParent = parent;
//        }
//        if(root.left != null && isCounsinss(root.left, x, y, level + 1, root)) return true;
//        if(root.right != null && isCounsinss(root.right, x, y, level + 1, root)) return true;
//
//        return false;
//    }
}
