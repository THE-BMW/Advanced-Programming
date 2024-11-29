import java.util.Calendar;

public class WithdrawalTransaction extends BaseTransaction {
    private boolean reversed = false;

    public WithdrawalTransaction(double amount, Calendar date, String transactionID) {
        super(amount, date, transactionID);
    }

    @Override
    public void apply(BankAccount ba) {
        if (ba.getBalance() < getAmount()) {
            System.out.println("Insufficient funds for withdrawal.");
            return;
        }
        ba.withdraw(getAmount());
        System.out.println("Withdrawn: " + getAmount());
    }

    @Override
    public void reverse(BankAccount ba) {
        if (!reversed) {
            ba.deposit(getAmount());
            reversed = true;
            System.out.println("Reversed withdrawal: " + getAmount());
        } else {
            System.out.println("Transaction already reversed.");
        }
    }
}

