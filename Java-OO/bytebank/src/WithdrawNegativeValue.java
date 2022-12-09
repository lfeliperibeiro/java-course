public class WithdrawNegativeValue {
    public static void main(String[] args) {
        Account account = new Account(20,20 );
        account.deposit(100);
        account.withdraw(200);
        System.out.println(account.getBalance());
    }
}
