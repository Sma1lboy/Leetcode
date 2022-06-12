import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * question form hackerrank
 */
class birthdayCakeCandles {

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
