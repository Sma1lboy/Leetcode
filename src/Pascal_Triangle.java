import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            List<Integer> sublist = new ArrayList<>();
            for(int j = 0; j < i; j++) {
                if(i == j || j == 0) {
                    sublist.add(1);
                } else {
                    //get prev row
                    List<Integer> temp = list.get(i - 1);
                    sublist.add(temp.get(j - 1) + temp.get(j));
                }
            }
            list.add(sublist);
        }
        return list;
    }

    public static void main(String[] args) {
        generate(4);
    }
}
