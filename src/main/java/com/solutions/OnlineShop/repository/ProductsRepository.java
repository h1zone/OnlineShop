package com.solutions.OnlineShop.repository;

import com.solutions.OnlineShop.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Long>{
}
