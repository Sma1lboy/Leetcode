public class Binary_Tree_Paths {
//    public List<String> binaryTreePaths(TreeNode root) {
//        List<String> res = new ArrayList<>(); // stores the final output
//        if(root==null) return res;
//        helper(root, "", res);
//        return res;
//    }
//    // DFS
//    private void helper(TreeNode root, String str, List<String> res) {
//        if(root.left==null && root.right==null) res.add(str + root.val); // reach a leaf node, completes a path
//        if(root.left!=null)                     helper(root.left, str+root.val+"->", res); // recursively checks its left child
//        if(root.right!=null)                    helper(root.right, str+root.val+"->", res); // recursively checks its right child
//    }
}
