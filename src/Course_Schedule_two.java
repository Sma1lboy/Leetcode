import java.util.*;

class Solution {
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        //create the freq map
        HashMap<Integer, List<Integer>> freqMap = new HashMap();
        //initial
        for(int i = 0; i < numCourses; i++){
            freqMap.put(i, new ArrayList<>());
        }
        for(int[] edge : prerequisites) {
            freqMap.get(edge[0]).add(edge[1]);
        }
        //visited set prevent cycle
        Set<Integer> visited = new HashSet<>();
        Set<Integer> cycle = new HashSet<>();
        //create list of res
        List<Integer> output = new ArrayList<>();
        //res

        for(int i = 0; i < numCourses; i++) {
            if(!dfs(i, output, visited, cycle, freqMap)) {
                return new int[]{};
            }
        }
        int[] res = new int[output.size()];
        for(int i = 0; i < numCourses; i++) {
            res[i] = output.get(i);
        }
        return res;
    }
    public static boolean dfs(int currCourse, List<Integer> output, Set<Integer> visited, Set<Integer> cycle, HashMap<Integer, List<Integer>> map) {
        //check base case cycle
        if(cycle.contains(currCourse)) {
            return false;
        }
        //this node already visited we dont have to visit again
        if(visited.contains(currCourse)){
            return true;
        }
        cycle.add(currCourse);
        for(Integer course : map.get(currCourse)) {
            if(!dfs(course, output, visited, cycle, map)) {
                return false;
            }
        }
        cycle.remove(currCourse);
        visited.add(currCourse);
        output.add(currCourse);
        return true;
    }

    public static void main(String[] args) {
        findOrder(2, new int[][]{{1,0}});
    }
}