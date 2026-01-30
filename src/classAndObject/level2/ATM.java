package level2;

class BankAccount{
	String accountHolder;
	int accountNumber;
	double balance;
	
	BankAccount(String a, int n, int b){
		accountHolder=a;
		accountNumber=n;
		balance=b;
	}
	void deposite(double amount) {
		if(amount>0) {
			balance=balance+amount;
            System.out.println("Deposited Amount : " + amount);
		}else {
            System.out.println("invalid deposit amount");

		}
		

	}
	void withdraw(double amount) {
		if (balance >= amount) {
			balance=balance-amount;
            System.out.println("Withdraw Amount : " + amount);

		}
			else {
	            System.out.println("invalid amount");

        
	}

	}
	void display() {
	    System.out.println("Account Holder Name : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Balance : " + balance);
        
	}
}
public class ATM {
public static void main(String[] args) {
	BankAccount b1=new BankAccount("maha",37282828,5000);
	 b1.display();
     b1.deposite(2000);
     b1.withdraw(3000);
     b1.display();
}}
