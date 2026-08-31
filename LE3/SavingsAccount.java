class SavingsAccount extends BankAccount {
    public SavingsAccount(String num, double balance) {
        super(num, balance);
    }

 
    public double withdraw(double amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;
            return amount;
        } else {
            double interest = balance * 0.05 * 1; // 5% for 1 year
            System.out.println("Your balance after one year will be: " + (balance + interest));
            return 0; // withdrawal failed
        }
    }
}