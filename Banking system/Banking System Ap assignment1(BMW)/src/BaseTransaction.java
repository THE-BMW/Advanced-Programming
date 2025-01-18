import java.util.Calendar;

/**
 * Represents a base transaction with common attributes and methods for all transactions.
 * Provides a default implementation for the apply method.
 *
 * @author BONIFACE MWANGI WARIGI
 * @since 1.0.0
 */
public class BaseTransaction implements TransactionInterface {
    private double amount;
    private Calendar date;
    private String transactionID;

    /**
     * Constructor for BaseTransaction.
     *
     * @param amount double - The amount of the transaction. Must be greater than 0.
     * @param date Calendar - The date of the transaction. Cannot be null.
     * @param transactionID String - A unique identifier for the transaction. Cannot be empty or null.
     */
    public BaseTransaction(double amount, Calendar date, String transactionID) {
        assert amount > 0 : "Transaction amount must be greater than 0.";
        assert date != null : "Transaction date cannot be null.";
        assert transactionID != null && !transactionID.isEmpty() : "Transaction ID cannot be null or empty.";

        this.amount = amount;
        this.date = date;
        this.transactionID = transactionID;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public Calendar getDate() {
        return date;
    }

    @Override
    public String getTransactionID() {
        return transactionID;
    }

    @Override
    public void printTransactionDetails() {
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Date: " + date.getTime());
        System.out.println("Amount: " + amount);
    }

    @Override
    public void apply(BankAccount ba) {
        System.out.println("Default transaction applied. No specific operation performed.");
    }

    @Override
    public void reverse(BankAccount ba) {
        throw new UnsupportedOperationException("Reverse not supported for BaseTransaction.");
    }
}
