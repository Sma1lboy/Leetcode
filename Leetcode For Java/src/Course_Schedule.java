import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Course_Schedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //create adjacent list
        HashMap<Integer, List<Integer>> preMap = new HashMap<>();
        //fill in the edge for every node
        for(int[] node : prerequisites) {
            if(!preMap.containsKey(node[0])) {
                preMap.put(node[0], new ArrayList<>());
            }
            preMap.get(node[0]).add(node[1]);
        }
        HashSet<Integer> visited = new HashSet<>();
        //go through every course to prevent unconnected graph
        for(int i = 0; i < numCourses; i++) {
            if(!dfs(i, preMap, visited)) {
                return false;
            }
        }
        return true;
    }
    public boolean dfs(int currCourse,HashMap<Integer, List<Integer>> map, HashSet<Integer> visitedSet) {
        //if the course already in the set, it's means there is exist loop.
        //so therefore we are impossible finish the course
        if(visitedSet.contains(currCourse)) {
            return false;
        }
        //if current course doesn't have any prerequistes course, then return true.
        if(map.get(currCourse) == null || map.get(currCourse).size() == 0) {
            return true;
        }
        visitedSet.add(currCourse);
        //go through every prequesit course
        for (int i = 0; i < map.get(currCourse).size(); i++) {
            int tmpCourse = map.get(currCourse).get(i);
            if(!dfs(tmpCourse, map, visitedSet)) {
                return false;
            }
        }
        visitedSet.remove(currCourse);
        map.get(currCourse).clear();
        return true;
    }
}
