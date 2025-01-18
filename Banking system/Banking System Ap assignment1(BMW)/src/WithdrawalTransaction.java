import java.util.Calendar;

/**
 * Represents a withdrawal transaction.
 * Decreases the balance of the associated bank account when applied.
 * Allows reversing the transaction to restore the original balance.
 *
 * @author BONIFACE MWANGI WARIGI
 * @since 1.0.0
 */
public class WithdrawalTransaction extends BaseTransaction {
    private boolean reversed = false;

    /**
     * Constructor for WithdrawalTransaction.
     *
     * @param amount double - The amount to withdraw. Must be greater than 0.
     * @param date Calendar - The date of the transaction. Cannot be null.
     * @param transactionID String - A unique identifier for the transaction. Cannot be empty or null.
     */
    public WithdrawalTransaction(double amount, Calendar date, String transactionID) {
        super(amount, date, transactionID);
    }

    @Override
    public void apply(BankAccount ba) {
        assert ba != null : "Bank account cannot be null.";
        if (ba.getBalance() < getAmount()) {
            throw new UnsupportedOperationException("Insufficient funds for withdrawal.");
        }
        ba.withdraw(getAmount());
        System.out.println("Withdrawn: " + getAmount());
    }

    @Override
    public void reverse(BankAccount ba) {
        assert ba != null : "Bank account cannot be null.";
        if (!reversed) {
            ba.deposit(getAmount());
            reversed = true;
            System.out.println("Reversed withdrawal: " + getAmount());
        } else {
            System.out.println("Transaction already reversed.");
        }
    }
}
