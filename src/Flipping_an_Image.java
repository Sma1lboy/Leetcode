public class Flipping_an_Image {
    public int[][] flipAndInvertImage(int[][] image) {
        int len = image.length;
        for(int[] row: image) {
            for(int i = 0, j = len - 1; i <= j; i++, j--) {
                int temp = row[i];
                row[i] = 1- row[j];
                row[j] = 1- temp;
            }
        }
        return image;
    }
}
