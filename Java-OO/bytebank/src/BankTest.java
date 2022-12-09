public class BankTest {
    public static void main(String[] args) {
        Client felipe = new Client();
        felipe.setName( "Felipe Ribeiro");
        felipe.setCpf("000.000.000-00");
        felipe.setProfession("Software Develop");

        Account felipeAccount = new Account(1, 20);
        felipeAccount.deposit(100);
        felipeAccount.setOwner(felipe);
        System.out.println(felipeAccount.getOwner().getName());
        System.out.println( felipeAccount.getOwner());
    }
}
