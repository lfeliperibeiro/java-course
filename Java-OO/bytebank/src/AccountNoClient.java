public class AccountNoClient {
    public static void main(String[] args) {
        Account account = new Account(13, 400);

        Client noClient = new Client();
        account.setOwner(noClient);
        noClient.setName("Giovanna");

        System.out.println(account.getOwner().getName());
    }
}
