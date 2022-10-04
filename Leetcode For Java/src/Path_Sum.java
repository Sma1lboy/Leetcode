/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/10/4
 */
// public class Path_Sum {
//     public boolean hasPathSum(TreeNode root, int targetSum) {
//         if(root == null) {
//             return false;
//         }
//         return helper(root, targetSum);
//     }
//     private static boolean helper(TreeNode root, int remainSum) {
//         // x
//         if(root == null) {
//             return remainSum == 0;
//         }
//         return helper(root.left, remainSum - root.val) || helper(root.right, remainSum- root.val);
//     }
// }
