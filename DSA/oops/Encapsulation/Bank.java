import java.util.*;

class BankAcc {
  private double balance;

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) {
    balance -= amount;
  }

  public double getBalance() {
    return balance;
  }
}

public class Bank {
  public static void main(String[] args) {
    BankAcc acc = new BankAcc();
    acc.setBalance(100000.00);
    System.out.println(acc.getBalance());
    acc.deposit(5000.00);
    System.out.println(acc.getBalance());
    acc.withdraw(10000);
    System.out.println(acc.getBalance());
  }
}
