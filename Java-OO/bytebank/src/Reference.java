public class Reference {
    public static void main(String[] args) {
        Account firstAccount = new Account();
        firstAccount.balance = 300;
        System.out.println("saldo da primeira " + firstAccount.balance);

        Account secondAccount = firstAccount;
        System.out.println("saldo da segunda conta " + secondAccount.balance);

        secondAccount.balance += 100;
        System.out.println("saldo da segunda conta " + secondAccount.balance);
        System.out.println("saldo da primeira " + firstAccount.balance);


        if(firstAccount == secondAccount){
            System.out.println("São a mesma conta");
        }

        System.out.println(firstAccount);

    }
}
