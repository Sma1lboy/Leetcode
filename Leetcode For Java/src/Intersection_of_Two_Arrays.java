public class Intersection_of_Two_Arrays {
    public int[] intersection(int[] n1, int[] n2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(n1);
        Arrays.sort(n2);
        int i = 0, j = 0;
        while(i < n1.length && j < n2.length) {
            if(n1[i] < n2[j]) {
                i++;
            } else if (n1[i] > n2[j]) {
                j++;
            } else {
                set.add(n1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[set.size()];
        int k = 0;
        for(Integer num : set) {
            result[k++] = num;
        }
        return result;
    }
}
