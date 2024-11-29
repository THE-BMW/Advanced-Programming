import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(1000);

        // Deposit Transaction
        DepositTransaction deposit = new DepositTransaction(200, new GregorianCalendar(2023, Calendar.MARCH, 25), "TX1001");
        deposit.apply(ba);
        deposit.printTransactionDetails();

        // Withdrawal Transaction
        WithdrawalTransaction withdrawal = new WithdrawalTransaction(150, new GregorianCalendar(2023, Calendar.MARCH, 26), "TX1002");
        withdrawal.apply(ba);
        withdrawal.printTransactionDetails();

        // Reverse the withdrawal
        withdrawal.reverse(ba);
        withdrawal.reverse(ba); // Attempt to reverse again to show the condition

        System.out.println("Final Balance: " + ba.getBalance());

        // Testing Exception Handling
        try {
            WithdrawalTransaction largeWithdrawal = new WithdrawalTransaction(2000, new GregorianCalendar(2023, Calendar.MARCH, 27), "TX1003");
            largeWithdrawal.apply(ba);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final Balance after attempted large withdrawal: " + ba.getBalance());
    }
}
