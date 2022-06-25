public class Coin_Change {

    public int coinChange(int[] coins, int amount) {
        if(amount<1) return 0;
        return dfs(coins, amount, new int[amount + 1]);
    }
    public int dfs(int[] coins, int rem, int[] count) {
        //if reminder < 0 which is means there is exceeding amount
        if(rem < 0) {
            return -1;
        }
        //find one correct path
        if(rem == 0) {
            return 0;
        }
        //reuse the memoization
        if(count[rem] != 0) {
            return count[rem];
        }
        //initialize the min path
        int min = Integer.MAX_VALUE;
        for(int coin : coins) {
            //call find rest of path
            int res = dfs(coins, rem - coin, count);
            if(res >= 0 && res < min) {
                min = res+1;
            }
        }

        if(min == Integer.MAX_VALUE) {
            count[rem] = -1;
        } else {
            count[rem] = min;
        }
        return count[rem ];
    }
}
