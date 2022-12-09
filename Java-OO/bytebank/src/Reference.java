public class Reference {
    public static void main(String[] args) {
        Account firstAccount = new Account(12, 222);
        firstAccount.deposit(300);
        System.out.println("saldo da primeira " + firstAccount.getBalance());

        Account secondAccount = firstAccount;
        System.out.println("saldo da segunda conta " + secondAccount.getBalance());

        secondAccount.deposit(100);
        System.out.println("saldo da segunda conta " + secondAccount.getBalance());
        System.out.println("saldo da primeira " + firstAccount.getBalance());


        if(firstAccount == secondAccount){
            System.out.println("São a mesma conta");
        }

        System.out.println(firstAccount);

    }
}
