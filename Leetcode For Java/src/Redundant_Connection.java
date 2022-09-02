import java.util.Arrays;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/2
 */
public class Redundant_Connection {
    public static void main(String[] args) {
        findRedundantConnection(new int[][]{{1,2}, {1,3},{2,3}});
    }
    //thinking: array[i] < 0 which means it's parent,
    //otherwise >=0 means its toward some number
    public static int[] findRedundantConnection(int[][] edges) {
        //initial
        int parents[] = new int[edges.length + 1];
        //every node its self parent at begin
        Arrays.fill(parents, -1);
        for(int[] edge : edges) {
            if(!union(parents, edge[0], edge[1])) {
                return new int[]{edge[0], edge[1]};
            }
        }
        return new int[]{};
    }
    //find the parents, and how much nodes parents hold it
    private static int find(int[] parents, int v) {

        while(parents[v] >= 0) {
            v = parents[v];
        }
        return v;
    }
    private static boolean union(int[] parents, int v, int u) {
        int parentV = find(parents, v);
        int parentU = find(parents, u);
        if(parentV == parentU) {
            return false;
        }

        int totalNode = parentV + parentU;
        //now check size
        if(parentV <= parentU) {
            parents[v] = u ;
            parents[u] = totalNode;
        } else {
            parents[u] = v;
            parents[v] = totalNode;
        }
        return true;
    }

}
