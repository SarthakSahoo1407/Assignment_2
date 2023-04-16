package A;

import java.util.Stack;

public class Q04 {
    static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isDigit(c))
                stack.push(c - '0');
            else {
                int op2 = stack.pop();
                int op1 = stack.pop();
                switch(c) {
                    case '+':
                        stack.push(op1 + op2);
                        break;
                    case '-':
                        stack.push(op1 - op2);
                        break;
                    case '*':
                        stack.push(op1 * op2);
                        break;
                    case '/':
                        stack.push(op1 / op2);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "23+45-6*+"; // postfix expression to be evaluated
        int result = evaluatePostfix(exp);
        System.out.println("The result of postfix expression " + exp + " is: " + result);
    }
}
