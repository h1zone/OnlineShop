package com.solutions.OnlineShop.repository;

import com.solutions.OnlineShop.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CategoriesRepository extends JpaRepository<Categories, Long>{

    @Query("select c.id_category from Сategories c where c.name = :name")
    Categories findByName(@Param("name") String name);

    @Query("select c.name from Categories c where c.id_category = :id_category")
    Categories findById(@Param("id_category") int id_category);

    @Query("delete from Categories where id_category = :id_category")
    Categories deleteById(@Param("id_category") int id_category);

    @Query("insert into Categories values (:id_category, :name)")
    Categories saveCategorie(@Param("id_category, name") int id_category, String name);
}




