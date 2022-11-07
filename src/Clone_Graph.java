import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Clone_Graph {
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}


    class Solution {
        public Node cloneGraph(Node node) {
            //if node is null, we dont need to do anything
            if(node == null) return null;
            //make a root copy
            Node copy = new Node(node.val);
            //the new way to memorize if the node we visited or not
            //the length is the constrain + 1
            Node[] visited = new Node[101];
            //fill the all null into visited to represent unvisit
            Arrays.fill(visited, null);
            //call the dfs function();
            dfs(node, copy, visited);
            return copy;
        }
        public void dfs(Node node, Node copy, Node[] visited) {
            visited[copy.val] = copy;
            //go through every neighbors
            for(Node n : node.neighbors) {
                //if node never visited
                if(visited[n.val] == null) {
                    Node temp = new Node(n.val);
                    copy.neighbors.add(temp);
                    dfs(n, temp, visited);
                } else {
                    //if already visited, just find the objecet value on the visited array
                    copy.neighbors.add(visited[n.val]);
                }
            }
        }
    }
}
