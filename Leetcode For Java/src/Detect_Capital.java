//520
public class Detect_Capital {
    public static boolean detectCapitalUse(String word) {
        boolean case1 = true, case2 = true, case3 = true;
        //case 1
        for(int i = 0; i < word.length(); i++) {
            if (!Character.isUpperCase(word.charAt(i))) {
                case1 = false;
                break;
            }
        }
        if (case1) {
            return true;
        }

        //case 2
        for (int i = 0; i < word.length(); i++) {
            if(!Character.isLowerCase(word.charAt(i))) {
                case2 = false;
                break;
            }
        }
        if(case2) {
            return true;
        }

        //case 3
        for (int i = 1; i < word.length(); i++) {
            if(!Character.isLowerCase(word.charAt(i))) {
                case3 = false;
                break;
            }
        }
        if (case3) {
            return true;
        }
        //if not match
        return false;
    }

    //another solution from discussion

//    class Solution {
//        public boolean detectCapitalUse(String word) {
//            int capitals = 0;
//            for(char ch : word.toCharArray()) {
//                if(Character.isUpperCase(ch))
//                    capitals++;
//            }
//            // case 1 and case 2
//            if(capitals == word.length() || capitals == 0) return true;
//            return capitals == 1 && Character.isUpperCase(word.charAt(0));  // case 3
//        }
//    }

    public static void main(String[] args) {
        String word = "USA";
        boolean num = detectCapitalUse(word);

        System.out.println(num);

    }
}
