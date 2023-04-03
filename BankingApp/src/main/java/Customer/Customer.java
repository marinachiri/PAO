package Customer;

import java.text.SimpleDateFormat;
import java.util.*;

public class Customer {
    private final int customerId;
    private String firstName, lastName, CNP;
    private String birthDate;
    private String email;
    private String phone;
    private String address;

    public Customer(int customerId, String firstName, String lastName, String CNP, String birthDate, String email, String phone, String address) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.CNP = CNP;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.address = address;

    }


    @Override
    public String toString() {
        return "{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", CNP='" + CNP + '\'' +
                ", birthDate=" + (new SimpleDateFormat("yyyy-MM-dd")).format(birthDate) +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address=" + address.toString() +
                '}';
    }


}