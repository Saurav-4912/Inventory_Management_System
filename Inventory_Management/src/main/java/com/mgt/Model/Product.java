package com.mgt.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="product")
public class Product {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private Integer product_id;

    @Column(name="product_name")
    private String product_name;

    @Column(name="product_price")
    private Float product_price;
}
