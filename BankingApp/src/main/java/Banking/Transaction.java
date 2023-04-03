package Banking;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Transaction {
    private String fromIBAN;
    private String toIBAN;
    private double amount;
    private String description;
    private String creationDate;

    public Transaction(String fromIBAN, String toIBAN, double amount, String description, String creationDate) throws Exception {

        if(amount <= 0)
            throw new Exception("The given amount is too low!");

        this.fromIBAN = fromIBAN;
        this.toIBAN = toIBAN;
        this.amount = amount;
        this.description = description;
        this.creationDate = creationDate;
    }


    public String getFromIBAN() {
        return fromIBAN;
    }

    public void setFromIBAN(String fromIBAN) {
        this.fromIBAN = fromIBAN;
    }

    public String getToIBAN() {
        return toIBAN;
    }

    public void setToIBAN(String toIBAN) {
        this.toIBAN = toIBAN;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "from=" + fromIBAN +
                ", to=" + toIBAN +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", creationDate=" + (new SimpleDateFormat("yyyy-MM-dd+HH:MM:SS")).format(creationDate) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Double.compare(that.amount, amount) == 0 && Objects.equals(fromIBAN, that.fromIBAN) && Objects.equals(toIBAN, that.toIBAN) && Objects.equals(description, that.description) && Objects.equals(creationDate, that.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromIBAN, toIBAN, amount, description, creationDate);
    }
/*
    public static void main(String[] args) throws Exception {
        Transaction tr1 = new Transaction("snbsbsbshb", "bjbj", 1.11, "desc1", "2021-02-30");
        System.out.println(tr1.toString());

        Transaction tr2 = new Transaction("snbsbsbshb2", "bjbj2", 1.12, "desc2", "2022-09-08");
        System.out.println(tr2.toString());

    }


 */

}