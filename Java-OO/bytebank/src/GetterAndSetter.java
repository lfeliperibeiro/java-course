public class GetterAndSetter {
    public static void main(String[] args) {
        Account account = new Account(20, 29);
        account.setNumber(1234);
        System.out.println(account.getNumber());
    }
}
