package com.neoteric.java;

import java.util.Date;

public class Account {
    public String accountCustomerName;
    public String addhar;
    public String pan;
    public Date dob;


    public Account(String accountCustomerName,String addhar,String pan ,Date dob){
        this.accountCustomerName= accountCustomerName;
        this.addhar=addhar;
        this.pan=pan;
        this.dob=dob;


    }

    public String getAccountCustomerName() {
        return accountCustomerName;
    }

    public String getAddhar() {
        return addhar;
    }

    public String getPan() {
        return pan;
    }

    public Date getDob() {
        return dob;
    }
}
