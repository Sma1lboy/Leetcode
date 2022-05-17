public class Plus_One {
    public int[] plusOne(int[] digits) {
        int index = digits.length -1;
        return increaseArr(digits, index);
    }
    public int[] increaseArr(int[] arr, int index) {
        arr[index]++;
        if(arr[index] == 10) {
            arr[index] = 0;
            index--;

            if(index == -1) {
                int[] newArr = new int[arr.length + 1];
                newArr[0] = 1;
                for(int i = 1; i < newArr.length; i++) {
                    newArr[i] = arr[i -1];
                }
                return newArr;
            } else {
                return increaseArr(arr, index);
            }
        }
        return arr;
    }
}
