import java.util.Arrays;

public class Maximum_Area_ofPiece_of_Cake_After_Horizontal_and_Vertical_Cuts {
    public int maxArea(int h, int v, int[] hc, int[] vc) {
        //sort both hc and vc
        Arrays.sort(hc);
        Arrays.sort(vc);
        //find the biggest difference between two cuts
        //the lowest cut doesn't have difference because it's minus 0
        int maxHc = Math.max(hc[0] - 0, h - hc[hc.length - 1]);
        int maxVc = Math.max(vc[0] - 0, v - vc[vc.length - 1]);

        //go through every cuts if there exist a larger one
        for(int i = 1; i < hc.length; i++){
            maxHc = Math.max(maxHc, hc[i] - hc[i-1]);
        }
        //same for vc
        for(int i = 1; i < vc.length; i++){
            maxVc = Math.max(maxVc, vc[i] - vc[i-1]);
        }
        //it inform why we modulo 10^9 + 7 in description
        return (int)((long)maxHc * maxVc % 1000000007);
    }
}
