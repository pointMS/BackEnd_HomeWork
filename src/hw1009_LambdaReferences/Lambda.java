package hw1009_LambdaReferences;

//Using lambda expressions, implement functional interfaces.

import java.time.LocalDate;
import java.util.function.*;

public class Lambda {
    public static void main(String[] args) {
        //1 Given an integer, return a power of integer: 5 -> 25
        UnaryOperator<Integer> f1 = (a) -> a * a;
        System.out.println("Result 1: " + f1.apply(5));

        //2 Given a string, return modulo 2 of string length: "abcde" -> 1
        Function<String, Integer> f2 = (s) -> s.length() % 2;
        System.out.println("Result 2: " + f2.apply("abcde"));

        //3 Given a string, return its in upper case: "ivan" -> "IVAN"
        UnaryOperator<String> f3 = (s) -> s.toUpperCase();
        System.out.println("Result 3: " + f3.apply("ivan"));

        //4 Given 2 strings, return a sum of their lengths: "abc", "de" -> 5
        BiFunction<String, String, Integer> f4 = (s1, s2) -> s1.length() + s2.length();
        System.out.println("Result 4: " + f4.apply("abc", "de"));

        //5 Given 2 strings, print a sum of their lengths.
        BiConsumer<String, String> f5 = (s1, s2) -> System.out.println(s1.length() + s2.length());

        //6 Return a date of one week prior to today: "2020-05-30"
        UnaryOperator<LocalDate> f6 = (d) -> LocalDate.now().minusWeeks(1);

        //7 Given a string, return a string, which consists of a first half of its character, if length is even,
        //  returns an empty string otherwise: "abcde" -> "ab", "abcde" -> "".
        UnaryOperator<String> f7 = (s) -> (s.length() % 2 == 0) ? s.substring(0, s.length() / 2) : "";
        System.out.println("Result 7 even: " + f7.apply("abcd"));
        System.out.println("Result 7 odd: " + f7.apply("abc"));

        //8 Return a random number
        Supplier<Integer> f8 = () -> (int) (Math.random() * (100 - 1) + 1);
        System.out.println("Result 8: " + f8.get());

        //9 Given a string, return a reversed string: "abc" ->"cba"
        UnaryOperator<String> f9 = (s) -> new StringBuilder(s).reverse().toString();
        System.out.println("Result 9: " + f9.apply("abcd"));

        //10 Given a number, return a reversed number: 12345 -> 54321
        Function<Integer, Integer> f10 = (a) -> {
            int reverse = 0;
            while (a > 0) {
                reverse = reverse + a % 10;
                reverse = reverse * 10;
                a = a / 10;
            }
            return reverse / 10;
        };
        System.out.println("Result 10: " + f10.apply(12345));

        //11 Given a number, return true if it is even, false otherwise: 6 -> true, 25 -> false
        Predicate<Integer> f11 = (a) -> a % 2 == 0;
        System.out.println("Result 11 even: " + f11.test(6));
        System.out.println("Result 11 odd: " + f11.test(25));

        //12 Given a string, return true, if its length is more than 3, false otherwise: "ab" -> false, "abc" -> true
        Predicate<String> f12 = (s) -> s.length() >= 3;
        System.out.println("Result 12 even: " + f12.test("ab"));
        System.out.println("Result 12 odd: " + f12.test("abc"));

        //13 Given a string and a number x. Return true, if length of string is more than x, false otherwise. Hint: BiPredicate.
        BiPredicate<String, Integer> f13 = (s, x) -> s.length() > x;
        System.out.println("Result 13: " + f13.test("qwerty", 4));
        System.out.println("Result 13: " + f13.test("qwer", 4));

    }
}
