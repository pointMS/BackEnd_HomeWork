package hw1029_ValidatingBankAccount;

public class BankAccount {
    private String iban;

    public BankAccount(String iban) {
        this.iban = iban;
    }

    public String getIban() {
        return iban;
    }

    @Override
    public String toString() {
        return  iban;
    }
}
