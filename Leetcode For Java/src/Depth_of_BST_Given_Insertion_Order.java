/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/30
 */
public class Depth_of_BST_Given_Insertion_Order {
    public static void main(String[] args) {
        int i = maxDepthBST(new int[]{2, 1, 4, 3});
        System.out.println(i);

    }
        static class TreeNode {
            int val;
            int depth;
            TreeNode left, right;

            TreeNode(int val, int depth) {
                this.val = val;
                this.depth = depth;
            }

//         static TreeNode childOf(TreeNode parent, int val) {
//           return new TreeNode(val, parent.depth + 1);
//         }
        }
        static TreeNode root;
        public static int maxDepthBST(int[] order) {
            root = new TreeNode(0,-1);

            for(int node : order) {
                TreeNode temp = root;
                insert(temp, node);
            }
            // for(int i = 0; i < order.length; i++) {
            //     if(i == 0) {
            //         T
            //     }
            // }
            return depth(root) - 1;
        }
        private static int depth(TreeNode root) {
            if(root == null) return 0;
            return Math.max(depth(root.left),depth(root.right)) + 1;

        }
        private static TreeNode insert(TreeNode node, int val) {
            if(node == null) {
                return new TreeNode(val, 0);
            }
            if(node.val < val){
                node.right = insert(node.right, val);
            } else {
                node.left = insert(node.left, val);
            }
            return node;
        }
}
