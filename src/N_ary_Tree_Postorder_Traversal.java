public class N_ary_Tree_Postorder_Traversal {
    /**
     * The dfs case:
     */
//    public List<Integer> postorder(Node root) {
//        List<Integer> list = new ArrayList<>();
//        Stack<Node> stack = new Stack<>();
//        stack.push(root);
//        helper(root, list, stack);
//        return list;
//    }
//    public void helper(Node root, List<Integer> list, Stack<Node> stack) {
//        if(root == null) return;
//        Node curr = stack.pop();
//        for(Node child : curr.children) {
//            stack.push(child);
//            helper(root, list, stack);
//        }
//        list.add(curr.val);
//    }
}
