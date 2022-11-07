import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> list = new ArrayList<>();
        int len = grades.size();
        for(int i = 0; i < len; i++) {
            int currScore = grades.get(i);
            if(currScore % 5 > 2) {
                int newScore =((currScore / 5) + 1) * 5;
                if(newScore >= 40) {
                    currScore = newScore;
                }
            }
            list.add(currScore);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(73);
        list.add(67);
        list = gradingStudents(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
