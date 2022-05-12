//1641
public class Count_Sorted_Vowel_String {

    int a = 1, e = 1, i = 1, o = 1, u = 1;

    public int countVowelStrings(int n) {
        for (int i = 1; i < n; i++) {
            increment();
        }
        return a + e + i + o + u;
    }

    public void increment() {
        a = a + e + i + o + u;
        e = e + i + o + u;
        i = i + o + u;
        o = o + u;
    }

}
