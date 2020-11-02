package hw1029_ValidatingBankAccount;

//Дан список пользователей с банковскими счетами.
// Написать программу, которая проверяет правильность пользовательских данных по следующим трем правилам:
//        1.Клиент должен быть не моложе 17 лет
//        2.Банковский iban должен быть длиной 16
//        3.Первые два символа iban должны быть "DE"

//Программа должна выводить все ошибки. То есть, например, если у пользователя есть банковский счет длины 10 и начинающийся на "IT",
//то должно печататься два сообщения об ошибке.
//Подсказка: определить три исключения Exception и бросать их при проверке списка в цикле.

import hw1029_ValidatingBankAccount.exceptions.AgeException;
import hw1029_ValidatingBankAccount.exceptions.IbanLengthException;
import hw1029_ValidatingBankAccount.exceptions.IbanCountryCodeException;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer("Anna", 25, new BankAccount("DE22222222222222")); //ok
        Customer c2 = new Customer("Leon", 16, new BankAccount("DE33333333333333")); // years < 17
        Customer c3 = new Customer("Sabrina", 31, new BankAccount("DE444444444444")); // length < 16
        Customer c4 = new Customer("Harry", 36, new BankAccount("IT55555555555555")); //starts IT
        Customer c5 = new Customer("Max", 15, new BankAccount("EU44111122223333")); // starts EU + years<17
        List<Customer> customerList = Arrays.asList(c1, c2, c3, c4, c5);

        for (Customer c : customerList) {
            int count = 0;
            try {
                checkAge(c);
            } catch (AgeException e) {
                System.out.println(c.getName() + ": " + e);
                count++;
            }
            try {
                checkIbanLength(c);
            } catch (IbanLengthException e) {
                System.out.println(c.getName() + ": " + e);
                count++;
            }
            try {
                checkCountryCode(c);
            } catch (IbanCountryCodeException e) {
                System.out.println(c.getName() + ": " + e);
                count++;
            } finally {
                if (count == 0) {
                    System.out.println(c.getName() + ": " + "IBAN is correct");
                }
            }
        }
    }

    public static void checkAge(Customer c) throws AgeException {
        if (c.getAge() < 17) {
            throw new AgeException("Wrong age. The age is less 17");
        }
    }

    public static void checkIbanLength(Customer c) throws IbanLengthException {
        if (c.getBankAccount().getIban().length() < 16) {
            throw new IbanLengthException("Wrong length. IBAN should contain 16 symbols");
        }
    }

    public static void checkCountryCode(Customer c) throws IbanCountryCodeException {
        if (!c.getBankAccount().getIban().startsWith("DE")) {
            throw new IbanCountryCodeException("Wrong country code. IBAN should start with DE.");
        }
    }
}
