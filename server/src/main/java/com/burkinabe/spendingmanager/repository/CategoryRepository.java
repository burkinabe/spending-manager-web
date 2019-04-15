package com.burkinabe.spendingmanager.repository;

import com.burkinabe.spendingmanager.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
