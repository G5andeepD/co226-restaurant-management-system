package com.group16.restaurantmanagementsystem.order;

import com.group16.restaurantmanagementsystem.customer.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_placement")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateTime;
    private Long amount;
    private Long discount;
    private String paymentStatus;
    private LocalDate completionDate;
    private String orderStatus;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
