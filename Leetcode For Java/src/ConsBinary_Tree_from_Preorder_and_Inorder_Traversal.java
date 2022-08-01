public class ConsBinary_Tree_from_Preorder_and_Inorder_Traversal {
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        //base case
//        if(preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0) {
//            return null;
//        }
//        //get the root
//        TreeNode root = new TreeNode(preorder[0]);
//        if(preorder.length == 1) {
//            return root;
//        }
//        int rootIndex = -1;
//        for(int i = 0; i < inorder.length; i++) {
//            if(inorder[i] == root.val) {
//                rootIndex = i;
//                break;
//            }
//        }
//
//        //splite left and right subtree through pre and in
//        //for leftpre exclude the first root, then go through the root value
//        int[] leftpre = Arrays.copyOfRange(preorder, 1, rootIndex + 1);
//        int[] rightpre = Arrays.copyOfRange(preorder, rootIndex + 1, preorder.length);
//        int[] leftin = Arrays.copyOfRange(inorder, 0, rootIndex);
//        int[] rightin = Arrays.copyOfRange(inorder, rootIndex + 1, inorder.length);
//        root.left = buildTree(leftpre, leftin);
//        root.right = buildTree(rightpre, rightin);
//
//        return root;
//    }
}
