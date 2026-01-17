package level2;
class BankAccount1 {

    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount1(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double balance) 
    {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount1 
{

    SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    void display() 
    {
        System.out.println(accountNumber);
        System.out.println(accountHolder);
        System.out.println(getBalance());
    }
}

 public class BankAccount 
 {
 
    public static void main(String[] args) 
    {

        SavingsAccount s = new SavingsAccount(1001, "Maha", 50000);
        s.display();

        s.setBalance(60000);
        s.display();
    }
}



