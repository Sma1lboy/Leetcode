import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {
    public List<String> generateParenthesis(int n) {
        //the results list
        List<String> results = new ArrayList<>();

        //the n number decide how much open bracket and close bracket we need
        //we always need same number of open and close
        dfs(results, n, n, new StringBuilder());
        return results;

    }
    public void dfs(List<String> results, int open, int close, StringBuilder sb) {
        //base case
        //if we dont have any open dn close, we definitely finish one of those parentheses
        if(open == 0 && close == 0) {
            //add it into results
            results.add(sb.toString());
            return;
        }
        //if we still have open parenthesis
        if(open > 0) {

            sb.append("(");
            dfs(results, open - 1, close, sb);
            //delete it after finish
            //tips: the way delete last index just sb.length() - 1
            sb.setLength(sb.length() - 1);

        }
        //if we dont have open parenthesis and we only have close parenthesis
        //or we using too much open parenthesis
        if(open < close) {
            sb.append(")");
            dfs(results, open, close - 1, sb);
            sb.setLength(sb.length() - 1);
        }
    }
}
