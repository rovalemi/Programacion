package com.example.demo_afrv.controller;

import com.example.demo_afrv.dto.CategoryDTO;
import com.example.demo_afrv.model.Category;
import com.example.demo_afrv.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    // CreateCategoryDTO()
    @PostMapping
    public ResponseEntity<CategoryDTO> createCategoryDTO(@RequestBody CategoryDTO dto) {
        // DTO -> Entidad
        Category category = new Category();
        category.setName(dto.getName());
        category.setDescription(dto.getDescription());

        Category save = categoryService.saveCategory(category);

        // Entidad -> DTO
        CategoryDTO answer = convertToCategoryDTO(save);
        return new ResponseEntity<>(answer, HttpStatus.CREATED);
    }

    // listCategoriesDTO()
    @GetMapping
    public ResponseEntity<List<CategoryDTO>> listCategoriesDTO() {
        List<Category> lista = categoryService.listCategories();
        List<CategoryDTO> dtos = new ArrayList<>();
        for (Category category : lista) {
            dtos.add(convertToCategoryDTO(category));
        }
        return ResponseEntity.ok(dtos);
    }

    // getCategoryDTO()
    @GetMapping("/{id}")
    public ResponseEntity<CategoryDTO> getCategoryDTO(@PathVariable long id) {
        Category category = categoryService.findCategoryById(id);
        if (category == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(convertToCategoryDTO(category));
    }

    // GET: Listar todos
    @GetMapping
    public List<Category> listCategories() {
        return categoryService.listCategories();
    }

    // GET: Buscar por ID
    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Long id) {
        Category category = categoryService.findCategoryById(id);
        if (category != null) {
            return ResponseEntity.ok(category);
        }
        return ResponseEntity.notFound().build();
    }

    // POST: Crear
    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        return categoryService.saveCategory(category);
    }

    // DELETE: Borrar
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
        boolean deletedCategory = categoryService.deleteCategoryById(id);

        if (deletedCategory) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    // Convertir Entidad -> DTO
    private CategoryDTO convertToCategoryDTO(Category category) {
        CategoryDTO dto = new CategoryDTO();
        dto.setId(category.getId());
        dto.setName(category.getName());
        dto.setDescription(category.getDescription());
        return dto;
    }
}