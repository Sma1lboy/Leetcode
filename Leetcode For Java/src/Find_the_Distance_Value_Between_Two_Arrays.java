public class Find_the_Distance_Value_Between_Two_Arrays {
    public int findTheDistanceValue(int[] a1, int[] a2, int d) {
        int ans = 0;
        for(int i = 0; i < a1.length; i++) {
            boolean isValid = true;

            for(int j = 0; j < a2.length; j++) {
                int num = a1[i] - a2[j];
                if(num < 0) {
                    num = -num;
                }
                if(num <= d) {
                    isValid = false;
                    break;
                }
            }
            if(isValid) {
                ans++;
            }
        }
        return ans;
    }
}
