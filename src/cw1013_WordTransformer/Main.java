package cw1013_WordTransformer;


import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    //"abc defG ikl" -> "ABC defG IKL"
    // length == 3 -> toUpperCase
    // length == 5 -> *****
    // length == 2 -> toLowerCase

    public static void main(String[] args) {

        System.out.println(transform2("AB defG IKL"));
        System.out.println(transform3("abc defG ikl"));
        System.out.println(transform5("abcde defG iklmn"));

    }

    public static String transform(String s, Predicate<String> p, Function<String, String> f) {
        String[] temp = s.split(" ");
        for (int i = 0; i < temp.length; i++) {
            if (p.test(temp[i])) {
                temp[i] = f.apply(temp[i]);
            }
        }
        return String.join(" ", temp);
    }

    public static String transform2(String s) {
        return transform(s, (str) -> str.length() == 2, String::toLowerCase);
    }

    public static String transform3(String s) {
        return transform(s, (str) -> str.length() == 3, String::toUpperCase);
    }

    public static String transform5(String s) {
        return transform(s, str -> str.length() == 5, str -> str.replaceAll("[^*]", "*"));
    }
}
