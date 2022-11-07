/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/9
 */
public class Convert_Sorted_Array_to_Binary_Search_Tree {
    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) {
            return null;
        }
        TreeNode head = helper(nums, 0, nums.length - 1);
        return head;
    }
    public static TreeNode helper(int[] nums, int low, int high) {
        if(low > high) {
            return null;
        }
        int mid = low + ((high - low) / 2);
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, low, mid - 1);
        node.right = helper(nums, mid + 1, high);
        return node;
    }

    public static void main(String[] args) {
        sortedArrayToBST(new int []{-10,-3,0,5,9});
    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


}
