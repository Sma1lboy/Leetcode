//1342
public class Number_of_Steps_to_Reduce_a_Number_to_Zero {
    public static int numberOfSteps(int num) {
        int numSteps = 0;
        while (num > 0) {
            if (num % 2 != 0)  {
                num -= 1;
            }
            else {
                num /= 2;
            }
            numSteps++;
        }
        return numSteps;
    }
    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
    }
}
