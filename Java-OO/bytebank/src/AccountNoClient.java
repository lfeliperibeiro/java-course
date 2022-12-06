public class AccountNoClient {
    public static void main(String[] args) {
        Account noClient = new Account();
        noClient.owner = new Client();
        noClient.owner.name = "Giovanna";

        System.out.println( noClient.owner.name);
    }
}
