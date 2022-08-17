package Object;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Harry");
        account.setMoney(100);
        account.setPassword(new int[]{1, 1, 1, 1, 1, 1});

        account.show();
    }
}
