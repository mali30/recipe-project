package com.mohamedali.recipeproject.repositories;

import com.mohamedali.recipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
