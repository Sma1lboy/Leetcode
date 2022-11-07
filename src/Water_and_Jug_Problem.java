public class Water_and_Jug_Problem {
    public static void main(String[] args) {
        System.out.println(canMeasureWater(3,5,4));
    }
    public static boolean canMeasureWater(int j1, int j2, int targetCapacity) {
        int maxJug = Math.max(j1, j2);
        int minJug = Math.min(j1, j2);
        int capacity = 0;
        while(capacity < targetCapacity) {
            capacity += (maxJug - minJug);
        }
        return capacity == targetCapacity;
    }
}
