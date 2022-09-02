import java.util.*;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/2
 */
public class Amount_of_Time_for_Binary_Tree_to_Be_Infected {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(2);
        treeNode.left = new TreeNode(5);
        int i = amountOfTime(treeNode, 5);
        System.out.println(i);
    }

    public static int amountOfTime(TreeNode root, int start) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        buildGraph(root, map);

        Queue<Integer> q = new LinkedList<>();
        q.offer(start);

        int count = 0;
        HashSet<Integer> visited = new HashSet<>();
        visited.add(start);
        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Integer cur = q.poll();
                if (map.containsKey(cur)) {
                    for (Integer adjNode : map.get(cur)) {
                        if (!visited.contains(adjNode)) {
                            q.offer(adjNode);
                            visited.add(adjNode);
                        }
                    }
                }
            }
            count++;
        }
        return count - 1;
    }

    // build map for tree, yes tree is the kind of map without cycle
    private static void buildGraph(TreeNode root, Map<Integer, List<Integer>> map) {
        List<Integer> adjList = map.computeIfAbsent(root.val, param -> new ArrayList<>());
        if (root.left != null) {
            map.computeIfAbsent(root.left.val, param -> new ArrayList<>()).add(root.val);
            adjList.add(root.left.val);
            buildGraph(root.left, map);
        }
        if (root.right != null) {
            map.computeIfAbsent(root.right.val, param -> new ArrayList<>()).add(root.val);
            adjList.add(root.right.val);
            buildGraph(root.right, map);
        }

    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
