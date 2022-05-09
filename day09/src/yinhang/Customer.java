package yinhang;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void show(){
        System.out.println(
//Customer [Smith, Jane] has a account: id is 1000, annualInterestRate is 1.23％, balance is 1140.0
                "Customer ["+lastName+","+firstName+"] has a account: id is "+account.getId()
                        +",annulInterestRate is "+account.getAnnullnterestRate()*100+"%, balance is "+account.getBalance()
        );
    }


}
