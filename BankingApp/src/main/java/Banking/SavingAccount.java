package Banking;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class SavingAccount extends Account{
    private LocalDate startDate;
    private String endDate;
    private int interest;

    public SavingAccount(String IBAN, String swift, double amount, String name, int customerId, LocalDate startDate, String endDate, int interest) {
        super(IBAN, swift, amount, name, customerId);

        this.startDate = startDate;
        this.endDate = endDate;
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "IBAN='" + IBAN + '\'' +
                ", swift='" + swift + '\'' +
                ", amount=" + amount +
                ", name='" + name + '\'' +
                ", customerId=" + customerId +
                ", cards=" + cards +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", interest=" + interest +
                '}';
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SavingAccount that = (SavingAccount) o;
        return interest == that.interest && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDate, endDate, interest);
    }
/*
    public static void main(String[] args){
        SavingAccount svacc1 = new SavingAccount("svacc1", 1, 1 );
        System.out.println(svacc1.toString());
        SavingAccount svacc2 = new SavingAccount("svacc2", 2, 2);
        System.out.println(svacc2.toString());
    }

 */


}


