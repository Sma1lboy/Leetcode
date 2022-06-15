public class Find_the_KBeauty_of_a_Number   {
    public int divisorSubstrings(int num, int k) {
        String str = String.valueOf(num);
        int count = 0;
        int indexK = k - 1;
        for(int i = indexK; i < str.length();i++) {
            String temp = str.substring(i - indexK, i + 1);
            int tempNum = Integer.valueOf(temp);
            if(tempNum == 0) {
                continue;
            }
            if(num % tempNum == 0) {
                count++;
            }
        }
        return count;
    }
}
