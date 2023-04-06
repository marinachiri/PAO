package Card;


import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.*;

public class Card {
    private int cardId;
    private int CVV;
    private String number;
    private String name;
    private String IBAN;
    private String expirationDate;
    static private final Set<String> usedNumbers = new HashSet<>();


    public Card(int cardId, int CVV, String number, String name, String IBAN, String expirationDate){
        this.cardId = cardId;
        this.CVV = CVV;
        this.number = number;
        this.name = name;
        this.IBAN = IBAN;
        this.expirationDate = expirationDate;


    }

    public Card(int cardId, String iban, String name) {

    }

    private String generateCardNumber(){
        byte[] array = new byte[16];
        new Random().nextBytes(array);
        return new String(array, StandardCharsets.UTF_8);
    }

    public static int generateCardCVV(){
        var rand = new Random();
        return 100 + rand.nextInt(899);
    }
    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardId=" + cardId +
                ", CVV=" + CVV +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", IBAN='" + IBAN + '\'' +
                ", expirationDate=" + expirationDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cardId == card.cardId && CVV == card.CVV && Objects.equals(number, card.number) && Objects.equals(name, card.name) && Objects.equals(IBAN, card.IBAN) && Objects.equals(expirationDate, card.expirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardId, CVV, number, name, IBAN, expirationDate);
    }
}