package com.solutions.OnlineShop.entity;

import javax.persistence.*; // без этого аннтоации не работают
import javax.validation.constraints.NotNull; // в чем разница с import com.sun.istack.NotNull; ?


@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int id_product;

    private int id_subcategory;
    private String name;
    private String description;
    private int price; // numeric ?
    private int quantity;
}





