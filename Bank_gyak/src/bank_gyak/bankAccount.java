public class bankAccount {
    private String accountNumber;
    private String name;
    private double balance;

    public bankAccount(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Az összeg nem lehet negatív!");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else if (amount > balance) {
            System.out.println("Nincs elegendő egyenleg!");
        } else {
            System.out.println("Az összeg nem lehet negatív!");
        }
    }

 
    public String getDetails() {
        return "Számla szám: " + accountNumber + ", Név: " + name + ", Egyenleg: " + balance;
    }
}