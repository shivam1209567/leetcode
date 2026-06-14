import java.util.*;

class Solution {

    private void evaluate(Stack<Integer> val, Stack<Character> op) {
        int v2 = val.pop();
        int v1 = val.pop();

        char sign = op.pop();

        if (sign == '+') {
            val.push(v1 + v2);
        } else {
            val.push(v1 - v2);
        }
    }

    public int calculate(String s) {

        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == ' ') continue;

            if (Character.isDigit(ch)) {

                int num = 0;

                while (i < s.length() &&
                       Character.isDigit(s.charAt(i))) {

                    num = num * 10 +
                          (s.charAt(i) - '0');

                    i++;
                }

                i--;

                val.push(num);
            }

            else if (ch == '(') {

                op.push(ch);
            }

            else if (ch == '+' || ch == '-') {

                // FIX:
                // Your code failed on:
                // 1-(     -2)
                // because it checked only i-1.
                int j = i - 1;

                while (j >= 0 && s.charAt(j) == ' ') {
                    j--;
                }

                if (j < 0 || s.charAt(j) == '(') {
                    val.push(0);
                }

                while (!op.isEmpty() &&
                       op.peek() != '(') {

                    evaluate(val, op);
                }

                op.push(ch);
            }

            else if (ch == ')') {

                while (!op.isEmpty() &&
                       op.peek() != '(') {

                    evaluate(val, op);
                }

                if (!op.isEmpty()) {
                    op.pop();
                }
            }
        }

        while (!op.isEmpty()) {

            evaluate(val, op);
        }

        return val.pop();
    }
}