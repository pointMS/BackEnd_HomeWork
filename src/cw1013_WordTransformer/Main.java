package cw1013_WordTransformer;

import java.util.function.UnaryOperator;

public class Main {
    //"abc defG ikl" -> "ABC defG IKL"
    // length == 3 -> toUpperCase

    //Choose functional interfaces and extend method signature
    //Adjust logic in the method to use these functional interfaces

    public static void main(String[] args) {
        UnaryOperator<String> s = (s1) -> transform(s1);
        System.out.println(s.apply("abc defG ikl"));
    }

    public static String transform(String s) {
        String[] temp = s.split(" ");
        String result = "";
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].length() == 3) {
                temp[i] = temp[i].toUpperCase();
            }
            result = result.concat(" ").concat(temp[i]);
        }
        return result;
    }
}
