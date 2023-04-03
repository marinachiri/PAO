package Banking;


import Card.Card;

import java.util.*;

public class Account {
    protected String IBAN;
    protected String swift;
    protected double amount;
    protected String name;
    protected int customerId;
    protected List<Card> cards = new ArrayList<>();

    public Account(String IBAN, String swift, double amount, String name, int customerId) {
        this.IBAN = IBAN;
        this.swift = swift;
        this.amount = amount;
        this.name = name;
        this.customerId = customerId;
    }



    public Account() {

    }

    public Account(String name, int customerId, int uniqueId) {

    }


    //getteri si setteri
    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getSwift() {
        return swift;
    }

    public void setSwift(String swift) {
        this.swift = swift;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "IBAN='" + IBAN + '\'' +
                ", swift='" + swift + '\'' +
                ", amount=" + amount +
                ", name='" + name + '\'' +
                ", customerId=" + customerId +
                '}';
    }


    private String generateIBAN(int uniqueId) {

        return "RO06" + "BRD" + "B" + uniqueId;
    }

    private String generateSwift() {

        return "SWIFT" + "BRD" + "B";
    }
/*
    public static void main(String[] args) {
        Account acc1 = new Account();
        System.out.println(acc1.toString());

        Account acc2 = new Account("iban1", "12", 1.1, "name1",1);
        System.out.println(acc2.toString());
        Account acc3 = new Account("iban2", "13", 1.2, "name2",2);
        System.out.println(acc3.toString());

    }

 */

  }