/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/28
 */
public class Minimum_Amount_of_Time_to_Collect_Garbage {

    class Solution {
        public int garbageCollection(String[] garbage, int[] travel) {
            //initial
            int metalIndexMustGo = -1;
            int paperIndexMustGo = -1;
            int galssIndexMustGo = -1;

            int total = 0;
            //find highest index every car have to go
            for (int i = 0; i < garbage.length; i++) {
                String s = garbage[i];
                if (s.indexOf("M") >= 0) {
                    metalIndexMustGo = i;
                }
                if (s.indexOf("P") >= 0) {
                    paperIndexMustGo = i;
                }
                if (s.indexOf("G") >= 0) {
                    galssIndexMustGo = i;
                }
            }
            //travel time
            if (metalIndexMustGo > 0) {
                for (int i = 0; i < metalIndexMustGo; i++) {
                    total += travel[i];
                }
            }
            if (paperIndexMustGo > 0) {

                for (int i = 0; i < paperIndexMustGo; i++) {
                    total += travel[i];
                }
            }
            if (galssIndexMustGo > 0) {
                for (int i = 0; i < galssIndexMustGo; i++) {
                    total += travel[i];
                }
            }
            //total garbage we need to collect
            for (String s : garbage) {
                total += s.length();
            }
            return total;
        }
    }

}
