import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence {
    //first version
//    public int longestConsecutive(int[] nums) {
//        //create a set to store number
//        HashSet<Integer> numSet = new HashSet<>();
//        int longestSet = 0;
//        //fill everything into the set
//        for(int num : nums) {
//            numSet.add(num);
//        }
//        for(int num : nums) {
//            //check if we need to start a new line
//            if(!numSet.contains(num - 1)) {
//                int length = 1;
//                //check the length
//                while(numSet.contains(num + length)){
//                    length++;
//                }
//                longestSet = Math.max(longestSet, length);
//            }
//        }
//        return longestSet;
//    }
    //fast version
//    public int longestConsecutive(int[] nums) {
//        //create a set
//        Set<Integer> set = new HashSet<>();
//        //longest set we need
//        int longestSet = 0;
//        //fill the set
//        for(int num : nums) {
//            set.add(num);
//        }
//        for(int num : nums) {
//            //check if contains the number
//            if(!set.contains(num)) {
//                continue;
//            } else {
//                //if it is check all the number relate to this number
//                int length = 0;
//                set.remove(num);
//                //add one count after remove
//                length++;
//                //number relate on left side
//                int numElementLeft = 0;
//                //left shift of the number
//                int numCopyLeft = num - 1;
//                while(set.contains(numCopyLeft)) {
//                    set.remove(numCopyLeft--);
//                    numElementLeft++;
//                }
//                //number relate on right side
//                int numElementRight = 0;
//                int numCopyRight = num + 1;
//                while(set.contains(numCopyRight)) {
//                    set.remove(numCopyRight++);
//                    numElementRight++;
//                }
//                length += numElementRight + numElementLeft;
//                longestSet = Math.max(longestSet, length);
//            }
//        }
//
//        return longestSet;
//    }

    //third version
    public int longestConsecutive(int[] nums) {
        //create a set
        Set<Integer> set = new HashSet<>();
        //longest set we need
        int longestSet = 0;
        //fill the set
        for(int num : nums) {
            set.add(num);
        }
        for(int num : nums) {
            //check if contains the number
            if(!set.contains(num)) {
                continue;
            } else {
                //if it is check all the number relate to this number
                int length = 0;
                set.remove(num);
                //add one count after remove
                length++;
                //left shift of the number
                int numCopyLeft = num - 1;
                while(set.contains(numCopyLeft)) {
                    set.remove(numCopyLeft--);
                    length++;
                }
                int numCopyRight = num + 1;
                while(set.contains(numCopyRight)) {
                    set.remove(numCopyRight++);
                    length++;
                }
                longestSet = Math.max(longestSet, length);
            }
        }

        return longestSet;
    }
}
