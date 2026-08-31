class CurrentAccount extends BankAccount {
    static double limits_check = 100000;

    public CurrentAccount(String num, double balance) {
        super(num, balance);
    }

   
    public double withdraw(double amount) {
        if (balance >= amount && amount > 0 && limits_check >= amount) {
            limits_check -= amount;
            balance -= amount;
            return amount;
        }
        return 0; // withdrawal failed
    }
}