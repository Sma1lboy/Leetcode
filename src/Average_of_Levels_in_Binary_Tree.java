public class Average_of_Levels_in_Binary_Tree {
//    public List<Double> averageOfLevels(TreeNode root) {
//        List<Double> list = new ArrayList<>();
//        bfs(root, list);
//        return list;
//    }
//    public void bfs(TreeNode root, List<Double> list){
//        if(root == null) return;
//        Queue<TreeNode> q = new LinkedList<>();
//        q.offer(root);
//        while(!q.isEmpty()) {
//            int n = q.size();
//            double sum = 0.0;
//            for(int i = 0; i < n; i++) {
//                TreeNode node = q.poll();
//                sum += node.val;
//                if(node.left != null) q.add(node.left);
//                if(node.right != null) q.add(node.right);
//            }
//            list.add(sum / n);
//        }
//    }
}
