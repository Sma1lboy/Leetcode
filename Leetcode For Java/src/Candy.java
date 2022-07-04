public class Candy {
    class Solution {
        public int candy(int[] ratings) {
            //every child at least has one candy, so we distribute one candy to every child
            int children[] = new int[ratings.length];
            for(int i = 0; i < ratings.length; i++) {
                children[i] = 1;
            }
            //traverse from left to right if the child n+1 rating greater than n, then his can should set of one more candy than child n
            for(int i = 1; i < ratings.length; i++){
                if(ratings[i] > ratings[i-1]) {
                    children[i] = children[i - 1] + 1;
                }
            }
            //now traverse from right to left, if the child n  rating is greater than n-1, and child n is less than one more than n + 1 child candies
            for(int i = ratings.length - 1; i > 0; i--) {
                if(ratings[i-1] > ratings[i]) {
                    if(children[i-1] < children[i] + 1) {
                        children[i-1] = children[i] + 1;
                    }
                }
            }
            int sum = 0;
            for(int childCandy : children) {
                sum += childCandy;
            }
            return sum;
        }
    }
}
