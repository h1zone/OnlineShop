package com.solutions.OnlineShop.repository;

import com.solutions.OnlineShop.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    // здесь методы должны называться "низким уровнем"

    @Query("select c.id_category from Сategories c where c.name = :name")
    Category selectByName(@Param("name") String name);

    @Query("select c.id_category from Сategories c where c.name like '%:name%'")
    List<Category> selectAllByName(@Param("name") String name);

    @Query("select c.name from Categories c where c.id_category = :id_category")
    Category selectById(@Param("id_category") int id_category);

    @Query("delete from Categories where id_category = :id_category")
    Category deleteById(@Param("id_category") int id_category);

    @Query("insert into Categories (id_category, name) values (:id_category, :name)")
    Category insertCategory(@Param("id_category") int id_category, @Param("name") String name);

    @Query("update Categories set name = :name where id_category = :id_category")
    Category updateCategory(@Param("id_category") int id_category, @Param("name") String name);
}