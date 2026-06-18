public class BankingApp {
    public static void main(String[] args) {
        SavingsAcc account = new SavingsAcc("123456", 5000, 10);

        System.out.println("Account Information");
        System.out.println("Account ID: " + account.getAccId());
        System.out.println("Available Funds: " + account.getAmount());

        System.out.println("After Deposit: " + account.addMoney(15000));
        System.out.println("After Withdrawal: " + account.takeMoney(5000));
        System.out.println("After Interest Credit: " + account.applyInterest());
    }
}
abstract class Account {
    private String accId;
    private double amount;

     public Account(String accId, double amount) {
        this.accId = accId;
        this.amount = amount;
    }

     public double addMoney(double cash) {
        amount += cash;
        return amount;
    }

      public double takeMoney(double cash) {
        amount -= cash;
        return amount;
    }

     public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

class SavingsAcc extends Account {
    private int rate;
    public SavingsAcc(String accId, double amount, int rate) {
        super(accId, amount);
        this.rate = rate;
    }

      @Override
    public double takeMoney(double cash) {
        double remainingFunds = getAmount() - cash;

        if (remainingFunds < 1000) {
            System.out.println("Transaction rejected! Minimum fund requirement is 1000.");
            return getAmount();
        } else {
            setAmount(remainingFunds);
            return getAmount();
        }
    }

     public double applyInterest() {
        double interest = getAmount() * rate / 100;
        setAmount(getAmount() + interest);
        return getAmount();
    }
    public double addInterest() {
        double interest = getAmount() * rate / 100;
        setAmount(getAmount() + interest);
        return getAmount();
    }

    public int getInterestRate() {
        return rate;
    }

    public void setInterestRate(int rate) {
        this.rate = rate;
    }
}