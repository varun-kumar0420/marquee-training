function createBankAccount(accHolder, mobile, email, balance = 0) {
  return {
    accountHolder: accHolder,
    mobile: mobile,
    email: email,
    balance: balance,

    deposit(amount) {
      this.balance += amount;
    },

    withdraw(amount) {
      this.balance -= amount;
    },

    checkBalance() {
      console.log(`Your balance is ${this.balance}`);
    },

    checkBankProfile() {
      console.log(`Account Holder = ${accHolder}`);
      console.log(`Mobile no. = ${mobile}`);
      console.log(`Email = ${email}`);
      console.log(`Account Balance = ${this.balance}`);
    }
  };
}

let account1 = createBankAccount(
  "Varun Kumar",
  "6200704250",
  "varun1142@gmail.com",
  100000
);
console.log(`##################`);
let account2 = createBankAccount(
  "Sunny Kumar",
  "6200704247",
  "sunny1142@gmail.com",
  145000
);

account1.checkBankProfile();

account1.deposit(5000);
account1.checkBalance();

account1.withdraw(70000);
account1.checkBalance();

console.log(`##################`);
account2.checkBankProfile();

account2.deposit(5000);
account2.checkBalance();

account2.withdraw(7000);
account2.checkBalance();