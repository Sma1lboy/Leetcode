public class Binary_Tree_Level_Order_Traversal {
//    class Solution {
//        public List<List<Integer>> levelOrder(TreeNode root) {
//            List<List<Integer>> list = new ArrayList<>();
//
//            if(root == null) {
//                return list;
//            }
//
//            Queue<TreeNode> q = new LinkedList<>();;
//            q.add(root);
//            while(!q.isEmpty()) {
//                int size = q.size();
//                List<Integer> sublist = new ArrayList<>();
//                for(int i = 0; i < size; i++) {
//                    //add it into sublist
//                    TreeNode curr = q.poll();
//                    sublist.add(curr.val);
//                    if(curr.left != null) {
//                        q.offer(curr.left);
//                    }
//                    if(curr.right != null) {
//                        q.offer(curr.right);
//                    }
//                }
//                list.add(sublist);
//            }
//            return list;
//        }
//    }
}
