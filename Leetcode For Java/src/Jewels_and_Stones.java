//771
public class Jewels_and_Stones {

    public int numJewelsInStones(String jewels, String stones) {
        int totalNum = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) totalNum++;
            }
        }
        return totalNum;
    }
    public static void main(String[] args) {

    }
}