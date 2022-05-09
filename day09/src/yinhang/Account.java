package yinhang;

public class Account {
    private int id;
    private double balance;
    private double annullnterestRate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnullnterestRate() {
        return annullnterestRate;
    }

    public void setAnnullnterestRate(double annullnterestRate) {
        this.annullnterestRate = annullnterestRate;
    }
//取款
    public double withdraw(double money) {
        if (balance >= money) {
            balance -= money;
            System.out.println("成功取款:"+money);
        }else {
            System.out.println("余额不足,取款失败");
        }
        return balance;
    }
//存款
    public double deposit(double money){

        System.out.println("成功存款"+money);
        return balance+=money;
    }

}
