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
    public Categories addCategorie(Categories categorie) {
        Categories savedCategorie = categoriesRepository.saveAndFlush(categorie);

        return savedCategorie;
    }

    // не фурычит
    @Override
    public void delete(long id_category) {
    //    categoriesRepository.delete(id_category);
    }


    // не фурычит. сунул заглушку
    @Override
    public Categories getByName(String name) {
    //    return categoriesRepository.findByName(name);
        return null;
    }

    // не фурычит. сунул заглушку
    @Override
    public Categories getById(int id_category) {
        //    return categoriesRepository.findByName(name);
        return null;
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
