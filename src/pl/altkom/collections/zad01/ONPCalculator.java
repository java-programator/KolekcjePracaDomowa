package pl.altkom.collections.zad01;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ONPCalculator {

    /**
     * Uzupełnij ciało poniższej funkcji, tak aby obliczało właściwą wartość wyrażenia ONP
     * Algorytm do obliczania tego wyrażenia można znaleźć pod adresem:
     * https://pl.wikipedia.org/wiki/Odwrotna_notacja_polska
     * W zadaniu chodzi o praktyczne użycie struktury danych stosu.
     */
    private static int ONPValue(List<String> onp) {
        Stack<Integer> stack = new Stack<>();

        for (String element : onp) {
            if (element == "+") {
                Integer a = stack.pop();
                Integer b = stack.pop();
                Integer c = a + b;
                stack.push(c);
            } else if (element == "-") {
                Integer a = stack.pop();
                Integer b = stack.pop();
                Integer c = b - a;
                stack.push(c);
            } else if (element == "*") {
                Integer a = stack.pop();
                Integer b = stack.pop();
                Integer c = a * b;
                stack.push(c);
            } else if (element == "/") {
                Integer a = stack.pop();
                Integer b = stack.pop();
                Integer c = b / a;
                stack.push(c);
            } else {
                Integer a = Integer.parseInt(element);
                stack.push(a);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        List<String> onp = Arrays.asList("12", "2", "3", "4", "*", "10", "5", "/", "+", "*", "+");
        System.out.println(ONPValue(onp));
    }
}
