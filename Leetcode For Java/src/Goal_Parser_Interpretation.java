public class Goal_Parser_Interpretation {
    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
    }
    public static String interpret(String command) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < command.length(); ) {
            if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    result.append("o");
                    i +=2;
                }
                else if(command.charAt(i + 1) == 'a') {
                    result.append("al");
                    i += 4;
                }
            }
            else{
                result.append(command.charAt(i));
                i++;
            }
        }
        return result.toString();
    }
}
