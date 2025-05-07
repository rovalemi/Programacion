package com.example.demo_afrv.services;

import com.example.demo_afrv.model.Product;
import com.example.demo_afrv.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // findAll();
    public List<Product> listProducts() {
        return productRepository.findAll();
    }

    // save();
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // findById();
    public Product findProductById(Long id) {
        Product product = productRepository.findById(id).orElse(null);
        return product;
    }

    // deleteById();
    public boolean deleteProductById(Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return true;
        }
        return false;
    }
}