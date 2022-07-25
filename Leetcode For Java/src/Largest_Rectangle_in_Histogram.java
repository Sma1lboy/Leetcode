import java.util.Stack;

public class Largest_Rectangle_in_Histogram {
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for(int i = 0; i < heights.length; i++) {
            int currHeight = heights[i];
            while(!stack.isEmpty() && heights[stack.peek()] > currHeight) {
                int idx = stack.pop();
                 int prevH = heights[idx];
                 int left = stack.isEmpty() ? -1 : stack.peek();
                 maxArea = Math.max(maxArea, (i - 1 - left) * prevH);
            }
            stack.push(i);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        largestRectangleArea(new int[] {2,1,5,6,2,3});
    }
}
