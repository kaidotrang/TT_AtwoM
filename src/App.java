public class App {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(50);
        System.out.println(account.getBalance());
        account.deposit(70);
        System.out.println(account.getBalance());
        account.withdraw(30);
        System.out.println(account.getBalance());
    }
}
