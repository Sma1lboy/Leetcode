import java.util.Stack;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/9
 */
public class Build_Binary_Expression_Tree_From_Infix_Expression {
    static class Node {
        char val;
        Node left;
        Node right;

        Node() {
            this.val = ' ';
        }

        Node(char val) {
            this.val = val;
        }

        Node(char val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        expTree("3*4-2*5");
    }
    public static Node expTree(String s) {
        s = "("+ s +")";

        Stack<Node> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(!Character.isDigit(c) && c != '(') {
                //the right is right side prev operation
                Node right = stack.pop();
                // if it's '*' or '/', we need to check if the previous operator
                // in stack if also '*' or '/', because e.g. 2 + 3 * 5, we have to
                // calcualte the 3 * 5 first
                if(c == '*' || c == '/') {
                    if(stack.peek().val == '*' || stack.peek().val == '/') {
                        Node operation = stack.pop();
                        Node left = stack.pop();
                        operation.left = left;
                        operation.right = right;
                        right = operation;
                    }

                } else { // if it is + or - or ) wher have to go through until we met the (
                    while(stack.peek().val != '(') {
                        Node operator = stack.pop();
                        Node left = stack.pop();
                        operator.left = left;
                        operator.right = right;
                        right = operator;
                    }
                    if(c == ')') {
                        stack.pop();
                    }
                }
                stack.push(right);
            }
            if(c != ')') {
                stack.push(new Node(c));
            }

        }
        return stack.pop();
    }
}
