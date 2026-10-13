class BankAccount {
    private String accountNumber;
    protected double balance;

    // Constructor
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount > balance) {
            refuse("not enough money");
        } else {
            balance -= amount;
        }
    }

    // Refuse withdrawal
    void refuse(String why) {
        System.out.println(accountNumber + " refused: " + why);
    }

    // Display balance
    void show() {
        System.out.println(accountNumber + " balance: " + balance);
    }
}

// Savings Account
class SavingsAccount extends BankAccount {

    SavingsAccount(String n, double b) {
        super(n, b);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount < 50) {
            refuse("must keep at least 50");
        } else {
            balance -= amount;
        }
    }
}

// Current Account
class CurrentAccount extends BankAccount {

    CurrentAccount(String n, double b) {
        super(n, b);
    }

    @Override
    void withdraw(double amount) {
        if (balance - amount < -200) {
            refuse("overdraft limit is 200");
        } else {
            balance -= amount;
        }
    }
}

// Student Account
class StudentAccount extends BankAccount {

    StudentAccount(String n, double b) {
        super(n, b);
    }

    @Override
    void withdraw(double amount) {
        if (amount > 100) {
            refuse("max 100 per withdrawal");
        } else {
            super.withdraw(amount);
        }
    }
}

