
import java.util.*;


/**
 * question form hackerrank
 */
class BirthdayCakeCandles {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int len = candles.size();
        int max = 0;
        int count = 0;
        for(int i = 0; i < len; i++) {
            max = Math.max(candles.get(i), max);
        }

        for(int i = 0; i < len; i++) {
            if(max == candles.get(i)) {
                count++;
            }
        }
        return  count;
    }


}
