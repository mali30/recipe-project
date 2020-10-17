package com.mohamedali.recipeproject.repositories;

import com.mohamedali.recipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
