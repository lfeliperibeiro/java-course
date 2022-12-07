public class Method {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(150);
        System.out.println(account.getBalance());

        Client client = new Client();

        boolean canWithdraw = account.withdraw(25);
        System.out.println(account.getBalance());
        System.out.println(canWithdraw);

        Account otherAccount = new Account();
        otherAccount.deposit(1000);

        boolean transferSuccess =  otherAccount.transfer(300, account);

       if(transferSuccess){
           System.out.println("transferencia com sucesso");
       } else{
           System.out.println("faltou saldo");
       }
        System.out.println(otherAccount.getBalance());
        System.out.println(account.getBalance());

        account.setOwner(client) ;
        client.setName("Felipe Ribeiro");

        System.out.println(client.getName());
    }
}
