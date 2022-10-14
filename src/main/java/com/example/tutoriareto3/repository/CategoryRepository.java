package com.example.tutoriareto3.repository;

import com.example.tutoriareto3.entities.Category;
import com.example.tutoriareto3.repository.crudRepository.CategoryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepository {

    @Autowired
    private CategoryCrudRepository categoryCrudRepository;

    public List<Category> getALL(){
        return (List<Category>)  categoryCrudRepository.findAll();
    }

    public Category save(Category category){
        return  categoryCrudRepository.save(category);
    }

    public void delete(Category category){
        categoryCrudRepository.delete(category);
    }

    public Optional<Category> getCategory(int id){
        return categoryCrudRepository.findById(id);
    }
}
