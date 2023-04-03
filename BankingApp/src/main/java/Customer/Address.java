package Customer;

import java.util.Scanner;

public class Address {
    private String street;
    private String city;
    private String county;
    private int postalCode;

    public Address(String street, String city, String county, int postalCode) {
        this.street = street;
        this.city = city;
        this.county = county;
        this.postalCode = postalCode;
    }
    public void read(Scanner in){
        System.out.println("Street: ");
        this.street = in.nextLine();
        System.out.println("City: ");
        this.city = in.nextLine();
        System.out.println("County: ");
        this.county = in.nextLine();
        System.out.println("Postal code: ");
        this.postalCode = Integer.parseInt(in.nextLine());
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }


}