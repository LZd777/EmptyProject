package yinhang;

public class Demo {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setFirstName("Jane");
        c1.setLastName("Smith");
        c1.setAccount(new Account());
        c1.getAccount().setId(1000);
        c1.getAccount().setBalance(2000);
        c1.getAccount().setAnnullnterestRate(0.0123);
        c1.getAccount().deposit(100);
        c1.getAccount().withdraw(960);
        c1.getAccount().withdraw(2000);
        c1.show();
        //Customer [Smith, Jane] has a account: id is 1000, annualInterestRate is 1.23％, balance is 1140.0

    }
}
