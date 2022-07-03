public class Permutations_two {





    //TODO version one
    //thinking: the regular permutation of the sequence number should be nums.length!
    //but we have dupilicate number, so we have to detect it and avoid add repeat number
    //I m using hash map for this question
//    public List<List<Integer>> permuteUnique(int[] nums) {
//        //initial result list
//        List<List<Integer>> list = new ArrayList<>();
//
//        //freq map
//        HashMap<Integer, Integer> map = new HashMap<>();
//        //fill the map
//        for(int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        backtracking(list, new ArrayList<>(), map, nums.length);
//        return list;
//    }
//    public void backtracking(List<List<Integer>> list, List<Integer> tempList, HashMap<Integer, Integer> map, int numsLeng) {
//        //base case if nums.lenght equals to temp list
//        if(tempList.size() == numsLeng) {
//            list.add(new ArrayList<>(tempList));
//            return;
//        }
//
//        //go through each value in freq map
//        for(Integer key : map.keySet()){
//            //check if there still has count
//            if(map.get(key) > 0) {
//                //add it into temp list
//                tempList.add(key);
//                map.put(key, map.get(key) - 1);
//                backtracking(list, tempList, map, numsLeng);
//                map.put(key, map.get(key) + 1);
//                tempList.remove(tempList.size() - 1);
//            }
//        }
//
//    }
}
