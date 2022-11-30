public class CreateAccount {
    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.balance = 200;

        firstAccount.balance += 100;
        System.out.println("primeira conta tem " + firstAccount.balance);

        Account secondAccount = new Account();
        secondAccount.balance = 50;
        System.out.println("segunda conta tem " + secondAccount.balance);

        System.out.println(firstAccount.agency);
        System.out.println(firstAccount.number);
    }
}
