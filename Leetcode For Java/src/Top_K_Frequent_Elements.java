public class Top_K_Frequent_Elements {
    //bucket sort
    public int[] topKFrequent(int[] nums, int k) {
        //create the freq map
        HashMap<Integer, Integer> map = new HashMap<>();
        //fill the freq map
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //create the bucket
        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];

        //fill the bucket
        for(Integer i : map.keySet()) {
            int key = i;
            int value = map.get(i);

            //if the bucket is empty, initialize it
            if(bucket[value] == null) {
                bucket[value] = new ArrayList<>();
            }
            //add the value the freq list
            bucket[value].add(key);
        }

        int[] result = new int[k];
        int counter = 0;

        for(int i = nums.length; i >= 0; i--) {
            //check if bucket[i] not null, otherwise jump over it
            if(bucket[i] != null) {
                for(Integer j : bucket[i]) {
                    if(k == 0) {
                        break;
                    }
                    result[counter] = j;
                    counter++;
                    k--;
                }
            }
        }
        return result;

    }
}
