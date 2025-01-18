import java.util.Calendar;

/**
 * Interface representing a generic transaction.
 * Provides methods for accessing transaction details and applying the transaction.
 *
 * @author BONIFACE MWANGI WARIGI
 * @since 1.0.0
 */
public interface TransactionInterface {

    /**
     * Retrieves the transaction amount.
     *
     * @return double - The amount of the transaction.
     */
    double getAmount();

    /**
     * Retrieves the transaction date.
     *
     * @return Calendar - The date of the transaction.
     */
    Calendar getDate();

    /**
     * Retrieves the transaction ID.
     *
     * @return String - A unique identifier for the transaction.
     */
    String getTransactionID();

    /**
     * Prints the details of the transaction to the console.
     */
    void printTransactionDetails();

    /**
     * Applies the transaction to a given bank account.
     *
     * @param ba BankAccount - The bank account to apply the transaction to.
     * @throws UnsupportedOperationException If the transaction cannot be applied.
     */
    void apply(BankAccount ba);

    /**
     * Reverses the transaction, if applicable.
     *
     * @param ba BankAccount - The bank account to reverse the transaction on.
     * @throws UnsupportedOperationException If the transaction cannot be reversed.
     */
    void reverse(BankAccount ba);
}
