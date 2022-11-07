import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/5
 */
public class Reorder_Data_in_Log_Files {
    public static void main(String[] args) {
        // reorderLogFiles(new String[]{"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"});
        System.out.println("a2 ".compareTo("g1 "));
    }
    public static String[] reorderLogFiles(String[] logs) {
        List<String> letLogsList = new ArrayList<>();
        List<String> digLogsList = new ArrayList<>();
        for(int i = 0; i < logs.length; i++) {
            String curLog = logs[i];

            //extract head
            curLog = curLog.substring(nextWord(curLog).length());
            if(Character.isLetter(curLog.charAt(0))) {
                letLogsList.add(logs[i]);
            } else {
                digLogsList.add(logs[i]);
            }
        }
        Collections.sort(letLogsList, (a, b) -> {

            a = a.substring(nextWord(a).length());
            b = b.substring(nextWord(b).length());
            return a.compareTo(b);
        });

        //combine
        String[] res = new String[logs.length];
        for(int i =0; i < letLogsList.size(); i++) {
            res[i] = letLogsList.get(i);
        }

        for(int i = 0; i < digLogsList.size(); i++) {
            res[i + letLogsList.size()] = digLogsList.get(i);
        }
        return res;
    }

    public static String nextWord(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int i = 0;
        while(i < n) {
            sb.append(s.charAt(i));
            //if it is spaces append it and break
            if(s.charAt(i) == ' ') {
                break;
            }
            i++;
        }
        return sb.toString();
    }
}
