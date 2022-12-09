public class CreateAccount {
    public static void main(String[] args) {
        Account firstAccount = new Account(2, 30);
        firstAccount.deposit(200);

        firstAccount.deposit(100);
        System.out.println("primeira conta tem " + firstAccount.getBalance());

        Account secondAccount = new Account(3, 30);
        secondAccount.deposit(50);
        System.out.println("segunda conta tem " + secondAccount.getBalance());

        System.out.println(firstAccount.getAgency());
        System.out.println(firstAccount.getNumber());
    }
}
