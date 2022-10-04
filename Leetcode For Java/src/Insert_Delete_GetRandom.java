import java.util.*;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/22
 */
public class Insert_Delete_GetRandom {
    public static void main(String[] args) {
        RandomizedSet set = new RandomizedSet();
        System.out.println(set.insert(1));
        System.out.println(set.remove(2));
        System.out.println(set.insert(2));
        System.out.println(set.getRandom());
        System.out.println(set.remove(1));
        System.out.println(set.insert(2));
        System.out.println(set.getRandom());





    }

    static class RandomizedSet {
        HashMap<Integer, Integer> idxMap;
        List<Integer> values;

        public RandomizedSet() {
            idxMap = new HashMap<>();
            values = new ArrayList<>();
            rnd = new Random();
        }

        public boolean insert(int val) {
            if (idxMap.containsKey(val)) {
                return false;
            }
            values.add(val);
            idxMap.put(val, values.size() - 1);
            return true;
        }

        public boolean remove(int val) {
            if (!idxMap.containsKey(val)) {
                return false;
            }
            int idx = idxMap.get(val);
                values.remove(idx);
                idxMap.remove(val);


            return true;
        }

        Random rnd;

        public int getRandom() {
            int rndNum = rnd.nextInt(values.size());
            return values.get(rndNum);
        }
    }

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
}
