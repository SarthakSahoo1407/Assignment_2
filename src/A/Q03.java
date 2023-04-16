package A;

import java.util.Stack;

public class Q03 {
    static String decimalToBinary(int n) {
        Stack<Integer> stack = new Stack<>();

        while (n > 0) {
            int rem = n % 2;
            stack.push(rem);
            n /= 2;
        }

        StringBuilder binary = new StringBuilder();

        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        int decimal = 20;
        String binary = decimalToBinary(decimal);
        System.out.println("The binary equivalent of " + decimal + " is " + binary);
    }

}
