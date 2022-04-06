package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@AllArgsConstructor
@Entity
@Builder
@Table(name = "Customers")
public class Customer {
    @Id
    @GeneratedValue
    private Integer id;
    private String username;
    private String city;
    private String country;

    public Customer() {

    }
}
