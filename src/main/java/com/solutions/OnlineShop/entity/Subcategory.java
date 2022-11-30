package com.solutions.OnlineShop.entity;

import javax.persistence.*; // без этого аннтоации не работают
import javax.validation.constraints.NotNull; // в чем разница с import com.sun.istack.NotNull; ?


@Entity
@Table(name = "subcategories")

public class Subcategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int id_subcategory;

    private int id_category;
    private String name;
}
