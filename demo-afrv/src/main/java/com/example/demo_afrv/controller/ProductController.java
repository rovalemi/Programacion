package com.example.demo_afrv.controller;

import com.example.demo_afrv.dto.ProductCreateDTO;
import com.example.demo_afrv.dto.ProductDTO;
import com.example.demo_afrv.model.Category;
import com.example.demo_afrv.model.Product;
import com.example.demo_afrv.services.CategoryService;
import com.example.demo_afrv.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    // Crear producto usando DTO de entrada (ProductCreateDTO)
    @PostMapping
    public ResponseEntity<ProductDTO> createProductDTO(@RequestBody ProductCreateDTO dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setStock(dto.getStock());
        product.setCostManufacturing(dto.getCostManufacturing());

        if (dto.getCategoryId() != null) {
            Category category = categoryService.findCategoryById(dto.getCategoryId());
            product.setCategory(category);
        }

        Product save = productService.saveProduct(product);

        ProductDTO answer = convertToProductDTO(save);

        return new ResponseEntity<>(answer, HttpStatus.CREATED);
    }

    // Listar productos (mostrando DTO sin stock ni costManufacturing)
    @GetMapping
    public ResponseEntity<List<ProductDTO>> listProductsDTO() {
        List<Product> products = productService.listProducts();
        List<ProductDTO> productDTOS = new ArrayList<>();
        for (Product product : products) {
            productDTOS.add(convertToProductDTO(product));
        }
        return ResponseEntity.ok(productDTOS);
    }

    // Obtener un producto por ID con DTO
    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductDTOById(@PathVariable Long id) {
        Product product = productService.findProductById(id);
        if (product == null) {
            return ResponseEntity.notFound().build();
        }
        ProductDTO productDTO = convertToProductDTO(product);
        return ResponseEntity.ok(productDTO);
    }

    // Actualizar un producto usando DTO de entrada
    @PutMapping("/{id}")
    public ResponseEntity<ProductDTO> updateProductDTO(@PathVariable Long id, @RequestBody ProductCreateDTO dto) {
        Product existingProduct = productService.findProductById(id);
        if (existingProduct == null) {
            return ResponseEntity.notFound().build();
        }
        existingProduct.setName(dto.getName());
        existingProduct.setPrice(dto.getPrice());
        existingProduct.setStock(dto.getStock());
        existingProduct.setCostManufacturing(dto.getCostManufacturing());

        if (dto.getCategoryId() != null) {
            Category category = categoryService.findCategoryById(dto.getCategoryId());
            existingProduct.setCategory(category);
        } else {
            existingProduct.setCategory(null);
        }

        Product updatedProduct = productService.saveProduct(existingProduct);
        ProductDTO answer = convertToProductDTO(updatedProduct);
        return ResponseEntity.ok(answer);
    }

    // GET: Listar todos
    @GetMapping
    public ResponseEntity<List<Product>> listProducts() {
        List<Product> products = productService.listProducts();
        return ResponseEntity.ok(products);
    }

    // GET: Buscar por ID
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Product product = productService.findProductById(id);
        if (product != null) {
            return ResponseEntity.ok(product);
        }
        return ResponseEntity.notFound().build();
    }

    // POST: Crear
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product savedProduct = productService.saveProduct(product);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    // PUT: Actualizar
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product) {
        Product searchProduct = productService.findProductById(id);
        if (searchProduct != null) {

            Product updatedProduct = productService.saveProduct(searchProduct);
            return ResponseEntity.ok(updatedProduct);
        }
        return ResponseEntity.notFound().build();
    }

    // DELETE: Borrar
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        boolean deletedProduct = productService.deleteProductById(id);

        if (deletedProduct) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    // Convertir Entidad -> DTO
    private ProductDTO convertToProductDTO(Product product) {
        ProductDTO dto = new ProductDTO();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setPrice(product.getPrice());
        if (product.getCategory() != null) {
            dto.setCategoryName(product.getCategory().getName());
        }
        return dto;
    }
}