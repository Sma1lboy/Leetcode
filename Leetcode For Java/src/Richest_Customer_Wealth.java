//1672
public class Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] num: accounts) {
            int temNum = 0;
            for (int i = 0; i< num.length; i++) {
                temNum += num[i];
            }
            if (max < temNum) {
                max = temNum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int result = maximumWealth(accounts);
        System.out.println(result);
    }
}
