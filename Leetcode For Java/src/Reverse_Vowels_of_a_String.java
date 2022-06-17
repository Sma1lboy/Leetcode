public class Reverse_Vowels_of_a_String {
    public String reverseVowels(String s) {
        int n = s.length();
        char arr[] = s.toCharArray();
        String vowels = "AEIOUaeiou";
        int i = 0, j = n - 1;
        while(i <= j) {
            if(vowels.contains(arr[i]+"") && vowels.contains(arr[j]+"")) {
                swap(arr, i, j);
                i++;
                j--;
            } else if (!vowels.contains(arr[i]+"")) {
                i++;
            } else if(!vowels.contains(arr[j]+"")) {
                j--;
            }
        }
        return String.valueOf(arr);
    }
    public void swap(char[] arr, int a , int b) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
