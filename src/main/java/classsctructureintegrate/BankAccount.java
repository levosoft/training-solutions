package classsctructureintegrate;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private int balance;


    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public int deposit(int amount){
        this.balance = this.balance + amount;
        return this.balance;
    }

    public int withdraw(int amount){
        this.balance = this.balance - amount;
        return this.balance;
    }

    public void transfer(BankAccount to, int amount){
        this.balance = this.balance - amount;
        to.balance = to.balance + amount;
    }

    public void getInfo(){
        System.out.println(this.owner + " (" + this.accountNumber + "): " + this.balance + " Ft");
    }
}
