package com.example.tutoriareto3.service;

import com.example.tutoriareto3.entities.Category;
import com.example.tutoriareto3.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll(){
        return categoryRepository.getALL();

    }

    public Optional<Category> getCategory(int id){
        return categoryRepository.getCategory(id);
    }

    public Category save(Category category){
        if(category.getId()==null){
            return categoryRepository.save(category);
        }else {
            Optional<Category> e =categoryRepository.getCategory(category.getId());
            if (e.isPresent()) {
                return category;
            }else {
                return categoryRepository.save((category));
            }
        }
    }

    public boolean delete(int id){
        boolean flag = false;
        Optional<Category> e =categoryRepository.getCategory(id);
        if (e.isPresent()) {
            categoryRepository.delete(e.get());
            flag = true;
        }
        return  flag;
    }

}
