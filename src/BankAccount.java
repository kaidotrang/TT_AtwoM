public class BankAccount {
    private double balance; // Bảo vệ dữ liệu

    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        }
    }

    public double getBalance() { // Chỉ đọc dữ liệu một cách an toàn
        return balance;
    }

    public void deposit(double amount) { // Kiểm soát việc nạp tiền
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) { // Kiểm soát việc rút tiền
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
