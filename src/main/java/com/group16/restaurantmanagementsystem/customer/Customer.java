package com.group16.restaurantmanagementsystem.customer;

import com.group16.restaurantmanagementsystem.order.Order;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;



    private String firstName;
    private String lastName;
    private String address;
    private String phoneNo;

    private String email;
@OneToMany(mappedBy = "customer")
private List<Order> orders;

    public Customer(String firstName, String lastName, String address, String phoneNo, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNo = phoneNo;
        this.email = email;
    }
}
