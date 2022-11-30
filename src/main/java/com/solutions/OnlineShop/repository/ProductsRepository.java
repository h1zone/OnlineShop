package com.solutions.OnlineShop.repository;

import com.solutions.OnlineShop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Long>{
}
