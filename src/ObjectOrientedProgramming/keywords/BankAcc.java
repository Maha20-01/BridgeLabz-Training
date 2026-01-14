package ObjectOrientedProgramming.keywords;

public class BankAcc{
        static String bankName = "m&m Bank";
        static int total = 0;
        final int accNo;
        String name;
        double bal;

        BankAcc(int accNo, String name, double bal) {
            this.accNo = accNo;
            this.name = name;
            this.bal = bal;
            total++;
        }
        static void getTotalAccounts() {
            System.out.println(total);
        }

        void show(Object o) {
            if (o instanceof BankAcc) {
                BankAcc b = (BankAcc) o;
                System.out.println(bankName);
                System.out.println(b.accNo);
                System.out.println(b.name);
                System.out.println(b.bal);
            }
        }
        public static void main(String[] args) {
            BankAcc b1 = new BankAcc(101, "Ram", 5000);
            BankAcc b2 = new BankAcc(102, "Sita", 8000);
            b1.show(b1);
            getTotalAccounts();
        }
    }


