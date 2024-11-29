import java.util.Calendar;

public class DepositTransaction extends BaseTransaction {
    public DepositTransaction(double amount, Calendar date, String transactionID) {
        super(amount, date, transactionID);
    }

    @Override
    public void apply(BankAccount ba) {
        ba.deposit(getAmount());
        System.out.println("Deposited: " + getAmount());
    }

    @Override
    public void reverse(BankAccount ba) {
        throw new UnsupportedOperationException("Reverse not allowed for deposits.");
    }
}

