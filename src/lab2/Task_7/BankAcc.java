package lab2.Task_7;

public class BankAcc implements BankAccMethods{
    float balance;
    int accNum;

    public BankAcc(float balance, int accNum) {
        this.balance = balance;
        this.accNum = accNum;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    public int getAccNum() {
        return accNum;
    }
    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }
    @Override
    public void createAcc() {
        new BankAcc(balance,accNum);
    }
    @Override
    public float getBalance() {
        return this.balance;
    }
    @Override
    public void doTransaction(float sumTrans) {
        this.balance = this.balance - sumTrans;
    }
}
