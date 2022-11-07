import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Open_the_Lock {
    public static int openLock(String[] deadends, String target) {


        //initial queue and we start at 0000, we cannot make out goal become 0000 again, so we add it into our visited
        Queue<String> q = new LinkedList<>();
        q.offer("0000");

        //visited and deads
        HashSet<String> visited = new HashSet<>();
        HashSet<String> deads = new HashSet<>(Arrays.asList(deadends));
        visited.add("0000");

        //the counter
        int count = 0;
        while(!q.isEmpty()) {
            int size = q.size();

            for(int i = 0; i < size ;i++) {
                String curr = q.poll();
                //check if it current string meet the target
                if(curr.equals(target)) {
                    return count;
                }
                //or if we met the dead lock, then we don't have to check this again
                if(deads.contains(curr)) {continue;}
                StringBuilder sb = new StringBuilder(curr);

                //now go throgh every digits, every digits could decrement and increment
                //which we have 8 ways
                for(int j = 0; j < 4; j++){

                    char c = sb.charAt(j);
                    //we have increment way and decrement way
                    //increment
                    String str1 = sb.substring(0,j) + (c == '9' ? 0 : c - '0' + 1) + sb.substring(j + 1);
                    //decrement
                    String str2 = sb.substring(0,j) + (c == '0' ? 9 : c - '0' - 1) + sb.substring(j + 1);
                    //check if it in the deads ,or  if it is already visited
                    if(!visited.contains(str1) && !deads.contains(str1)) {
                        visited.add(str1);
                        q.offer(str1);
                    }
                    if(!visited.contains(str2) && !deads.contains(str2)){
                        visited.add(str2);
                        q.offer(str2);
                    }
                }
            }

            count++;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[]  deadends = {"0201","0101","0102","1212","2002"};
        String target = "0202";
        System.out.println(openLock(deadends, target));
    }
}
