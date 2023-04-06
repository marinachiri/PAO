import Banking.Account;
import Card.Card;
import Customer.Customer;
import Customer.Address;


import java.time.LocalDate;
import java.util.*;

public class BankingApp {

        Customer c1 = new Customer(1, "Alexandru", "Macedonschi", "1750101410165", LocalDate.of(2000,02,20) , "alex.mace@yahoo.com", "+40 734 650 538", "Strada Mica, Craiova");
        Customer c2 = new Customer(2, "Diana", "Turcu", "2750101410164", LocalDate.of(1999,02,20), "diana.turcu@yahoo.com", "0701 216 393", "strada Mare, Bucuresti");
        Customer c3 = new Customer(3, "Iulian", "Ionescu", "1740101410165", LocalDate.of(2001,03,30), "iulian.ionescu@yahoo.com", "+40 702 044 125", "Sat Bucur, judetul Botosani");
        Customer c4 = new Customer(4, "Mihaela", "Dragut", "2750101410166", LocalDate.of(1999,04,06), "mihaela.draguyt@gmail.com", "0791 291 881", "Strada principala nr1, Tecuci");

        Account a1 = new Account("iban1", "swift1", 12.0, "account1", 1);
        Account a2 = new Account("iban2", "swift2", 13.0, "account2", 2);
        Account a3 = new Account("iban3", "swift3", 14.0, "account3", 3);
        Account a4 = new Account("iban4", "swift4", 15.0, "account4", 4);
        Account[] accounts = {a1,a2,a3,a4};
        Address add1 = new Address("Calea Sagului", "Timisoara", "Timis", 300516);
        Address add2 = new Address("Octavian Iosif", "Oradea", "Bihor", 410230);
        Address add3 = new Address("Mihai Viteazu", "Zalau", "Salaj", 450082);
        Address add4 = new Address("Termocentralei", "Targu Jiu", "Gorj", 210233);

        Card crd1 = new Card(1, 111, "1111", "Classic", "Ro082772167362", "2028-04-20");
        Card crd2 = new Card(2, 112, "1112", "Classic2", "Ro082772167363", "2028-04-20");
        Card crd3 = new Card(3, 113, "1113", "Classic3", "Ro082772167364", "2028-04-20");
        Card crd4 = new Card(4, 114, "11114", "Classic4", "Ro082772167365", "2028-04-20");


    public static void main(String[] args) {

        Service service = new Service();


          System.out.println("------------------------------------------------------------------------------");
          System.out.println("Bine ati venit!");
          System.out.println("1. Creare client");
          System.out.println("2. Creare card");
          System.out.println("3. Afisare date client");
          System.out.println("4. Extras de cont");
          System.out.println("5. Afisare cont client");
          System.out.println("6. Afisare conturi client");
          System.out.println("7. Incarcare cont client");
          System.out.println("8. Creare tranzactie");
          System.out.println("9. Creare cont bancar");
          System.out.println("10. Creare cont economii");
          System.out.println("11. Inchidere cont bancar");
          System.out.println("11. Afisare istoric tranzactii");
          System.out.println("X. EXIT");}

          private void execute ( int option){
              switch (option) {
                  case 1 -> {
                      createCustomer();
                  }
                  case 2 -> {
                      createCustomerCard();
                  }
                  case 3 -> {
                      displayCustomerInfo();
                  }
                  case 4 -> {
                      getCustomerAmount();

                  }
                  case 5 -> {
                      GetCustomerAccount();
                  }
                  case 6 -> {
                      GetCustomerAccounts();
                  }
                  case 7 -> {
                      loadCustomerAccount();
                  }
                  case 8 -> {
                      createTransaction();
                  }
                  case 9 -> {
                      createCustomerAcount();
                  }
                  case 10 -> {
                      createCustomerSavingAcount();
                  }
                  case 11 -> {
                      closeCustomerAccount();
                  }
                  case 12 -> {
                      getCustomerTransactions();
                  }
              }
          }


          private void createCustomer(){
              System.out.println("");

          }
          private void createCustomerCard(){
              System.out.println("");

          }
          private void displayCustomerInfo(){
              System.out.println("");

          }
          private void getCustomerAmount(){
              System.out.println("");

          }
          private void GetCustomerAccount(){
              System.out.println("");

          }
          private void GetCustomerAccounts(){
              System.out.println("");

          }
          private void loadCustomerAccount(){
              System.out.println("");

          }
          private void createTransaction(){
              System.out.println("");

          }
          private void createCustomerAcount(){
              System.out.println("");

          }
          private void createCustomerSavingAcount(){
              System.out.println("");

          }
          private void closeCustomerAccount(){
              System.out.println("");

          }
          private void getCustomerTransactions(){
              System.out.println("");

          }

      }