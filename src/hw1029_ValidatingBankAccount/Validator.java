package hw1029_ValidatingBankAccount;

import hw1029_ValidatingBankAccount.exceptions.AgeException;
import hw1029_ValidatingBankAccount.exceptions.IbanCountryCodeException;
import hw1029_ValidatingBankAccount.exceptions.IbanLengthException;

import java.util.List;

public class Validator {
    public static void validate(List<Customer> customers) {
        for (Customer customer : customers) {
            validateCustomer(customer);
        }
    }

    private static void validateCustomer(Customer customer) {
        int count = 0;
        try {
            checkAge(customer);
        } catch (AgeException e) {
            count++;
            System.out.println(e.getMessage());
        }

        try {
            checkIbanLength(customer);
        } catch (IbanLengthException e) {
            count++;
            System.out.println(e.getMessage());
        }

        try {
            checkCountryCode(customer);
        } catch (IbanCountryCodeException e) {
            count++;
            System.out.println(e.getMessage());
        } finally {
            if (count == 0) {
                System.out.println(customer.getName() + ": IBAN is valid");
            }
        }
    }

    private static void checkAge(Customer c) throws AgeException {
        if (c.getAge() < 17) {
            throw new AgeException(c.getName() + ": Invalid age");
        }
    }

    private static void checkIbanLength(Customer c) throws IbanLengthException {
        if (c.getBankAccount().getIban().length() < 16) {
            throw new IbanLengthException(c.getName() + ": Invalid length");
        }
    }

    private static void checkCountryCode(Customer c) throws IbanCountryCodeException {
        if (!c.getBankAccount().getIban().startsWith("DE")) {
            throw new IbanCountryCodeException(c.getName() + ": Invalid country code");
        }
    }
}
