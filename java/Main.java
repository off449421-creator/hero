package java;


public class Main {
    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount("ACC1001", "Aarav Sharma", 5000.0);
        BankAccount account2 = new BankAccount("ACC1002", "Sneha Thapa", 8000.0);

        
        account1.deposit(1500.0);
        account1.withdraw(2000.0);

        account2.deposit(1000.0);
        account2.withdraw(3000.0);

        
        System.out.println("\nFinal Balances:");
        account1.displayBalance();
        account2.displayBalance();
    }
}
