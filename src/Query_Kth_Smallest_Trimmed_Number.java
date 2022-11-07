import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Query_Kth_Smallest_Trimmed_Number {

    public static int[] smallestTrimmedNumbers(String[] nums, int[][] q) {
        if(nums == null) {
            return new int[]{};
        }
        int[] res = new int[q.length];
        //go through every queries
        for(int i = 0; i < q.length; i++) {
            String[] copyNum = Arrays.copyOf(nums, nums.length);


//

            for(int j = 0; j < copyNum.length; j++) {
               copyNum[j] =  copyNum[j].substring(copyNum[j].length() - q[i][1]);
            }

            Node[] nodes = new Node[copyNum.length];
            //given index and value into my nodes
            for(int index = 0; index < nodes.length; index++) {
                nodes[index] = new Node(index, copyNum[index]);
            }
            Arrays.sort(nodes, (a,b) -> a.val.equals(b.val) ? a.index - b.index : a.val.compareTo(b.val));
            res[i] = nodes[q[i][0] - 1].index;


        }
        return res;
    }
    static class Node {
        int index;
        String val;
        Node(int index, String val) {
            this.index = index;
            this.val = val;
        }
    }

    public static void main(String[] args) {
//String[] n = {"102","473","251","814"};


//String[] n = {"24","37","96","04"};
String[] n = {"325240361872","440618160237","785744447413","820980201297","470082520306","874146483840","425300857082","088636787077","813218016629","459000328006","188683382600"};
int[][] q = {{1,1}, {3,1}, {11,10}};
//int[][] q = {{2,1}, {2,2}};
        System.out.println(Arrays.toString(smallestTrimmedNumbers(n, q)));
    }
}

