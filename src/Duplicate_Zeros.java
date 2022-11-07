public class Duplicate_Zeros {
    public void duplicateZeros(int[] N) {
        int numZero = 0;
        for(int num : N) {
            if(num == 0) numZero++;
        }
        int i = N.length - 1;
        int j = N.length - 1 + numZero;
        while(i >= 0 && j >= 0) {
            if(N[i] != 0) {
                if(j < N.length) {
                    N[j] = N[i];
                }
            } else {
                if(j < N.length) {
                    N[j] = N[i];
                }
                j--;
                if(j < N.length) {
                    N[j] = N[i];
                }
            }
            i--;
            j--;
        }
    }
}
