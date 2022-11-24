package com.solutions.OnlineShop.service.impl;

import com.solutions.OnlineShop.entity.Categories;
import com.solutions.OnlineShop.repository.CategoriesRepository;
import com.solutions.OnlineShop.service.CategoriesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CategoriesServiceImpl implements CategoriesService {

    @Autowired
    private CategoriesRepository categoriesRepository;

    @Override
    public Categories addCategorie(int id, String name) {
        Categories savedCategorie = categoriesRepository.saveCategorie(id, name);
        return savedCategorie;
    }


    @Override
    public void delete(int id_category) {
        categoriesRepository.deleteById(id_category);
    }

    @Override
    public Categories getByName(String name) {
        return categoriesRepository.findByName(name);
    }

    @Override
    public Categories getById(int id_category) {
        return categoriesRepository.findById(id_category);
    }

    @Override
    public Categories editCategorie(Categories categorie) {
        return categoriesRepository.saveAndFlush(categorie);
    }

    @Override
    public List<Categories> getAll() {
        return categoriesRepository.findAll();
    }
}
