package org.example;

public class BankAccount {
    private double accNo;
    private String customerName;
    private double bal;
    private double phNo;
    private String email;

    public double getAccNo() {
        return accNo;
    }

    //constructor
    public BankAccount(double accNo, String customerName, double bal, double phNo, String email) {
        this.accNo = accNo;
        this.customerName = customerName;
        this.bal = bal;
        this.phNo = phNo;
        this.email = email;
    }

    public void setAccNo(double accNo) {
        this.accNo = accNo;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    public double getPhNo() {
        return phNo;
    }

    public void setPhNo(double phNo) {
        this.phNo = phNo;
    }

    public String getEmail() {
        return email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double deposit(int depo) {
        bal += depo;
        return bal;
    }

    public double withdraw(int amt) {
        if (bal < amt) throw new RuntimeException("Balance is not sufficient to withdraw");
        else
            bal -= amt;
        return bal;
    }

    public String bankInfo() {
        return "bc{Bank Acc  : " + accNo + " Account NAME : " + customerName + " Balance  : " + bal + "  phone number  : " + phNo + " email :" + email + "}";
    }
}
