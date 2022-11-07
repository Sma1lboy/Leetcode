//1486
public class XOR_Operation_in_an_Array {
    public int xorOperation(int n, int start) {
        int [] array = new int [n];
        int sum=0;
        for(int i=0;i<array.length;i++){
            array[i]=start+2*i;
            sum ^=array[i];
        }

        return sum;
    }

    public static void main(String[] args) {

    }
}
