public class Move_Pieces_to_Obtain_a_String {

        public static boolean canChange(String start, String target) {
            //check the sequence of the start and target, if not same return false, otherwise go on
            if(!start.replaceAll("_", "").equals(target.replaceAll("_",""))) {
                return false;
            }
            //and then go through the left to end and check every L and R, if L's index in target greater than start, return false, if R's index in target smaller than start, return false, otherwise go on

            //tips: now the start and target should be same sequence
            int n = start.length();
            for(int i = 0, j = 0; i < n && j < n; i++, j++) {
                //for i, find  next no _ letter index in start
                while(i < n && start.charAt(i) == '_') {
                    i++;
                }
                //for j, find next no _ letter index in target
                while(j < n && target.charAt(j) == '_' ) {
                    j++;
                }

                //now i and j find some letter
                //return false if L's index in target greater than start, R's index in target smaller than start
                //and check if i < n and j < n
                if(i < n && j < n && (start.charAt(i) == 'L' && i < j || start.charAt(i) == 'R' && i > j)) {
                    return false;
                }
            }
            return true;
        }

    public static void main(String[] args) {
        String a = "_R";
        String b = "R_";
        System.out.println(canChange(a,b));
    }

}
