public class BankTest {
    public static void main(String[] args) {
        Client felipe = new Client();
        felipe.name = "Felipe Ribeiro";
        felipe.cpf = "000.000.000-00";
        felipe.profession = "Software Develop";

        Account felipeAccount = new Account();
        felipeAccount.deposit(100);
        felipeAccount.owner = felipe;
        System.out.println( felipeAccount.owner.name);
        System.out.println( felipeAccount.owner);
    }
}
