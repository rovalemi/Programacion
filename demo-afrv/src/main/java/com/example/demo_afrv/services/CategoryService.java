package com.example.demo_afrv.services;

import com.example.demo_afrv.model.Category;
import com.example.demo_afrv.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    // findAll();
    public List<Category> listCategories() {
        return categoryRepository.findAll();
    }

    // save();
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    // findById();
    public Category findCategoryById(Long id) {
        Category category = categoryRepository.findById(id).orElse(null);
        return category;
    }

    // deleteById();
    public boolean deleteCategoryById(Long id) {
        if (categoryRepository.existsById(id)) {
            categoryRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
