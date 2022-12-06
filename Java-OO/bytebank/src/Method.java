public class Method {
    public static void main(String[] args) {
        Account account = new Account();
        account.balance = 100;
        account.deposit(50);
        System.out.println(account.balance);

        boolean canWithdraw = account.withdraw(25);
        System.out.println(account.balance);
        System.out.println(canWithdraw);

        Account otherAccount = new Account();
        otherAccount.deposit(1000);

        boolean transferSuccess =  otherAccount.transfer(300, account);

       if(transferSuccess){
           System.out.println("transferencia com sucesso");
       } else{
           System.out.println("faltou saldo");
       }
        System.out.println(otherAccount.balance);
        System.out.println(account.balance);

        account.owner.name = "Felipe Ribeiro";

        System.out.println(account.owner.name);
    }
}
