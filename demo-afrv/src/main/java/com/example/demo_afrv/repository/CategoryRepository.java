package com.example.demo_afrv.repository;

import com.example.demo_afrv.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

// @Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}