import java.util.HashMap;

//1603
public class ParkingSystem {

    HashMap<Integer, Integer> temp = new HashMap<>();

    public ParkingSystem(int big, int medium, int small) {
        temp.put(1, big);
        temp.put(2, medium);
        temp.put(3, small);
    }

    public boolean addCar(int carType) {
        int ans = temp.get(carType);
        temp.put(carType, temp.get(carType) - 1);
        return ans > 0;
    }
}
