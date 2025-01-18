/**
 * Represents a bank account with a balance.
 * Supports deposit and withdrawal operations.
 *
 * @author BONIFACE MWANGI WARIGI
 * @since 1.0.0
 */
public class BankAccount {
    private double balance;

    /**
     * Constructor for BankAccount.
     *
     * @param balance double - Initial balance of the account. Must be non-negative.
     */
    public BankAccount(double balance) {
        assert balance >= 0 : "Initial balance cannot be negative.";
        this.balance = balance;
    }

    /**
     * Deposits a specified amount into the account.
     *
     * @param amount double - Amount to deposit. Must be greater than 0.
     */
    public void deposit(double amount) {
        assert amount > 0 : "Deposit amount must be greater than 0.";
        balance += amount;
    }

    /**
     * Withdraws a specified amount from the account.
     *
     * @param amount double - Amount to withdraw. Must not exceed the current balance.
     */
    public void withdraw(double amount) {
        assert amount > 0 : "Withdrawal amount must be greater than 0.";
        assert amount <= balance : "Insufficient funds.";
        balance -= amount;
    }

    /**
     * Retrieves the current account balance.
     *
     * @return double - The current balance of the account.
     */
    public double getBalance() {
        return balance;
    }
}
