package com.neoteric.java;

import java.util.Date;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("12345","1234","1234",new Date());

        System.out.println(account.getAccountCustomerName()+account.getAddhar()+account.getPan()+account.getDob());

    }
}
