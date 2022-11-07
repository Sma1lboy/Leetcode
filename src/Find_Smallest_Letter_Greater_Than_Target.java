//744
public class Find_Smallest_Letter_Greater_Than_Target {
    public char nextGreatestLetter(char[] let, char target) {
        if(let.length == 0) {
            return ' ';
        }
        int start = 0, end = let.length -1, mid = 0;
        char res = let[0];
        while(start <= end) {
            mid = start + (end - start ) / 2;
            if(let[mid] == target || let[mid] < target) {
                start = mid + 1;
            } else {
                res = let[mid];
                end = mid - 1;
            }
        }
        return res;

    }
}
