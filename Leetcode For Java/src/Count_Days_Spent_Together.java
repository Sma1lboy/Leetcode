import java.sql.Time;
import java.util.Date;
import java.util.Timer;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/17
 */
public class Count_Days_Spent_Together {

    public static void main(String[] args) {


        int i = countDaysTogether("10-01", "10-31", "11-01", "12-31");
        System.out.println(i);
    }

    public static int countDaysTogether(String alive0, String alive1, String bob0, String bob1) {
        int a0 = getCount(alive0);
        int a1 = getCount(alive1);
        int b0 = getCount(bob0);
        int b1 = getCount(bob1);

        if(a1 < b0 || b1 < a0) return 0;

        return Math.abs(Math.max(a0, b0) - Math.min(a1, b1)) + 1;
    }

    private static int getCount(String str) {
        int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] strArr = str.split("-");
        int day = 0;
        for(int i = 0; i < Integer.parseInt(strArr[0]) - 1; i++) {
            day += months[i];
        }
        day += Integer.parseInt(strArr[1]);
        return day;
    }

}
