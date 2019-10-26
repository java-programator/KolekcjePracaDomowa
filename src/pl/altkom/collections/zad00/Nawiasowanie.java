package pl.altkom.collections.zad00;

import java.util.Stack;

public class Nawiasowanie {
    public static boolean check(String n) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                // c == ')'
                char c0 = stack.pop();
                if (c0 == '(') {
                    // wszytko ok
                } else {
                    // c0 = ')'
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        System.out.println(check("((()))()()(())"));
        System.out.println(check("((((()))()()(())"));
    }
}
