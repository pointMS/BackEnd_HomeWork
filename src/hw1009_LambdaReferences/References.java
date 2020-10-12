package hw1009_LambdaReferences;

//Using method reference, implement functional interfaces:

import java.util.function.*;

public class References {
    public static void main(String[] args) {

        //1 Print a given string
        Consumer<String> s1 = System.out::println;
        s1.accept("given string");

        //2 Given a string, return a lower case string
        UnaryOperator<String> s2 = String::toLowerCase;
        System.out.println(s2.apply("LOWER CASE STRING"));

        //3 Given a number, return a square root from the number
        UnaryOperator<Double> x = Math::sqrt;
        System.out.println(x.apply(30.0));

        //4 Implement solution 7 from above as a method reference
        Function<String, String> f7 = (s) -> (s.length() % 2 == 0) ? s.substring(0, s.length() / 2) : "";
        // String is not a functional interface, has more that one function

        //5 Given a class Employee with name and salary. Return an employee salary using 1. Supplier, 2. Function.
        Employee employee = new Employee("Tom",2500);
        Supplier<Integer> f1 = employee::getSalary;
        System.out.println(f1.get().toString());

        Function<Employee, Integer> f2 = Employee::getSalary;

    }
}
