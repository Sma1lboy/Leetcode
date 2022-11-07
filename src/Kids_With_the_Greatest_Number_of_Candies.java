import java.util.ArrayList;
import java.util.List;

//1431
public class Kids_With_the_Greatest_Number_of_Candies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int c : candies) {
            if (max < c) max = c;
        }
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= max) {
                result.add(true);
            }
            else {
                result.add(false);
            }
        }
        return result;
    }


//    TODO DIFFERENT SOLUTION
//    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        List<Boolean> result = new ArrayList<>();
//        for(int c: candies) {
//            boolean isGreatest = true;
//            for (int j = 0; j < candies.length; j++) {
//                if (c + extraCandies < candies[j]) {
//                    isGreatest = false;
//                    result.add(false);
//                    break;
//                }
//            }
//            if (isGreatest) {
//                result.add(true);
//            }
//        }
//        return result;
//    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3}; int extraCandies = 3;
        List<Boolean> result = kidsWithCandies(candies,extraCandies);
        System.out.println(result.toString());
    }
}
