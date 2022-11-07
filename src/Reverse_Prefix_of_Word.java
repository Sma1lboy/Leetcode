public class Reverse_Prefix_of_Word {
    public String reversePrefix(String word, char ch) {
        int locate = -1;
        char arr[] = word.toCharArray();
        for(int i = 0;i < arr.length; i++) {
            if(arr[i] == ch){
                locate = i;
                break;
            };
        }

        reverse(arr, 0, locate);
        return String.valueOf(arr);
    }
    public void reverse(char[] arr, int start, int end) {
        while(start <= end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
