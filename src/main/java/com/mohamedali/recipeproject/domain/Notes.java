package com.mohamedali.recipeproject.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /* we don't want cascade operations so we don't add
       we allow recipe to own it. if we delete notes we dont want to
       also have to delete the recipe. so this way we only delete the recipe
       which will delete the notes.
     */
    @OneToOne
    private Recipe recipe;

    /*
     Specifies that a persistent property or field should be persisted as a large object
     to a database-supported large object type.
   */
    @Lob
    private String recipeNotes;


    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
