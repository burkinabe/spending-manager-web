package com.burkinabe.spendingmanager.service;

import com.burkinabe.spendingmanager.entities.Category;
import com.burkinabe.spendingmanager.repository.CategoryRepository;

public class service {

    private final CategoryRepository categoryRepository;


    public service(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category save(Category category) {
        return categoryRepository.save(category);
    }
}
