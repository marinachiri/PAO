import Banking.Account;
import Banking.SavingAccount;
import Banking.Transaction;
import Card.Card;
import Customer.*;

import java.time.LocalDate;
import java.util.*;

import static Customer.Customer.accounts;
import static Customer.Customer.getCustomerId;

public class Service {

    public static void createCustomer() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customID: ");
        int customerId = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();


        System.out.print("Enter CNP: ");
        String CNP = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();

        System.out.print("Enter birthdate (yyyy-MM-dd): ");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine());

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        Customer customer = new Customer(customerId, firstName, lastName, CNP, birthDate, phone, email, address);

        System.out.println("New customer created: " + customer);

    }

    public static void displayCustomerInfo(Customer customer) {

        System.out.println("Customer ID: " + getCustomerId());
        System.out.println("First Name: " + customer.getFirstName());
        System.out.println("Last Name: " + customer.getLastName());
        System.out.println("CNP: " + customer.getCNP());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Phone: " + customer.getPhone());
        System.out.println("Birthdate: " + customer.getBirthDate());
        System.out.println("Address: " + customer.getAddress());

    }

    public static void createCard() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter CardID: ");
        int cardId = Integer.parseInt(scanner.nextLine());

        System.out.print("CVV: ");
        int CVV = Card.generateCardCVV();

        System.out.print("Enter number: ");
        String number = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter IBAN: ");
        String IBAN = scanner.nextLine();

        System.out.print("Enter expiration date (yyyy-MM-dd): ");
        String expirationDate = scanner.nextLine();


        Card card = new Card(cardId, CVV, number, name, IBAN, expirationDate);

        System.out.println("New card created: " + card);
    }

    public static void createTransaction() throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sending IBAN : ");
        String fromIBAN = scanner.nextLine();

        System.out.print("Enter destination IBAN : ");
        String toIBAN = scanner.nextLine();

        System.out.print("Enter amount: ");
        double amount = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        System.out.print("Creation Date is: ");
        LocalDate creationDate = LocalDate.now();

        Transaction transaction = new Transaction(fromIBAN, toIBAN, amount, description, creationDate);

        System.out.println("New transaction created: " + transaction);
    }

    public static void createAccount() throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter IBAN : ");
        String IBAN = scanner.nextLine();

        System.out.print("Enter swift : ");
        String swift = scanner.nextLine();

        System.out.print("Enter amount: ");
        double amount = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter CustomerId: ");
        int customerId = Integer.parseInt(scanner.nextLine());

        Account account = new Account(IBAN, swift, amount, name, customerId);

        System.out.println("New account created: " + account);
    }

    public static  void displayAccountByCustomerId(Account[] accounts, int customerId) {
        for (Account account : accounts) {
            if (account.getCustomerId() == customerId) {
                System.out.println("Account Details:");
                System.out.println("Name: " + account.getName());
                System.out.println("IBAN: " + account.getIBAN());
                System.out.println("Swift: " + account.getSwift());
                System.out.println("Amount: " + account.getAmount());
                return;
            }
        }
        System.out.println("No account found for customer ID: " + customerId);
    }
    public static void createSavingAccount() throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter IBAN : ");
        String IBAN = scanner.nextLine();

        System.out.print("Enter swift : ");
        String swift = scanner.nextLine();

        System.out.print("Enter amount: ");
        double amount = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter CustomerId: ");
        int customerId = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter start date: ");
        LocalDate startDate = LocalDate.now();

        System.out.print("Enter end date: ");
        String endDate = scanner.nextLine();

        System.out.print("Enter interest: ");
        int interest = Integer.parseInt(scanner.nextLine());

        SavingAccount savingAccount = new SavingAccount(IBAN, swift, amount, name, customerId, startDate, endDate, interest);

        System.out.println("New saving account created: " + savingAccount);
    }
    public static void closeAccountByIBAN(Account[] accounts, String IBAN) {
        for (Account account : accounts) {
            if (account.getIBAN().equals(IBAN)) {
                account.setAmount(0.0);
                System.out.println("Account with IBAN " + IBAN + " has been closed.");
                return;
            }
        }
        System.out.println("No account found with IBAN: " + IBAN);
    }




    public static void main (String[]args) throws Exception {

            Customer c1 = new Customer(1, "Alexandru", "Macedonschi", "1750101410165", LocalDate.of(2000, 02, 20), "alex.mace@yahoo.com", "+40 734 650 538", "Strada Mica, Craiova");
            Customer c2 = new Customer(2, "Diana", "Turcu", "2750101410164", LocalDate.of(1999, 02, 20), "diana.turcu@yahoo.com", "0701 216 393", "strada Mare, Bucuresti");
            Customer c3 = new Customer(3, "Iulian", "Ionescu", "1740101410165", LocalDate.of(2001, 03, 30), "iulian.ionescu@yahoo.com", "+40 702 044 125", "Sat Bucur, judetul Botosani");
            Customer c4 = new Customer(4, "Mihaela", "Dragut", "2750101410166", LocalDate.of(1999, 04, 06), "mihaela.draguyt@gmail.com", "0791 291 881", "Strada principala nr1, Tecuci");
            Customer[] customers = {c1,c2,c3,c4};

            Account a1 = new Account("iban1", "swift1", 12.0, "account1", 1);
            Account a2 = new Account("iban2", "swift2", 13.0, "account2", 1);
            Account a3 = new Account("iban3", "swift3", 14.0, "account3", 3);
            Account a4 = new Account("iban4", "swift4", 15.0, "account4", 4);
            Account[] accounts = {a1, a2, a3, a4};

            Address add1 = new Address("Calea Sagului", "Timisoara", "Timis", 300516);
            Address add2 = new Address("Octavian Iosif", "Oradea", "Bihor", 410230);
            Address add3 = new Address("Mihai Viteazu", "Zalau", "Salaj", 450082);
            Address add4 = new Address("Termocentralei", "Targu Jiu", "Gorj", 210233);

            Card crd1 = new Card(1, 111, "1111", "Classic", "Ro082772167362", "2028-04-20");
            Card crd2 = new Card(2, 112, "1112", "Classic2", "Ro082772167363", "2028-04-20");
            Card crd3 = new Card(3, 113, "1113", "Classic3", "Ro082772167364", "2028-04-20");
            Card crd4 = new Card(4, 114, "11114", "Classic4", "Ro082772167365", "2028-04-20");


            //displayCustomerInfo(c1);
            //createCustomer();
            //createCard();
            //createTransaction();
            //createAccount();
            //displayAccountByCustomerId(accounts, 1);
            //createSavingAccount();
            closeAccountByIBAN(accounts, "iban6");
        }
    }







