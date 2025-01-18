import java.util.Calendar;

/**
 * Represents a deposit transaction.
 * Increases the balance of the associated bank account when applied.
 *
 * @author BONIFACE MWANGI WARIGI
 * @since 1.0.0
 */
public class DepositTransaction extends BaseTransaction {

    /**
     * Constructor for DepositTransaction.
     *
     * @param amount double - The amount to deposit. Must be greater than 0.
     * @param date Calendar - The date of the transaction. Cannot be null.
     * @param transactionID String - A unique identifier for the transaction. Cannot be empty or null.
     */
    public DepositTransaction(double amount, Calendar date, String transactionID) {
        super(amount, date, transactionID);
    }

    @Override
    public void apply(BankAccount ba) {
        assert ba != null : "Bank account cannot be null.";
        ba.deposit(getAmount());
        System.out.println("Deposited: " + getAmount());
    }

    @Override
    public void reverse(BankAccount ba) {
        throw new UnsupportedOperationException("Reverse not allowed for deposits.");
    }
}
