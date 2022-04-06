package com.example.demo.model;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@EnableAutoConfiguration
@Table(name = "Products")
public class Product {
    @Id
    @GeneratedValue
    private Integer id;
    private int price;
}
