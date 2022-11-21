package com.solutions.OnlineShop.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*; // без этого аннтоации не работают
import javax.validation.constraints.NotNull; // в чем разница с import com.sun.istack.NotNull; ?
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "subcategories")

public class Subcategories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int id_subcategory;

    private int id_category;
    private String name;
}
