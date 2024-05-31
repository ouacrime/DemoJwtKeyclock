package net.ouacrime.inventoryservice.web;


import net.ouacrime.inventoryservice.entities.Product;
import net.ouacrime.inventoryservice.repository.ProductReposetory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {
    private ProductReposetory productRepository;

    public ProductRestController(ProductReposetory productRepository) {
        this.productRepository = productRepository;
    }
    @GetMapping("/products")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<Product> productList(){
        return productRepository.findAll();
    }
    @GetMapping("/products/{id}")
    @PreAuthorize("hasAuthority('USER')")
    public Product productById(@PathVariable String id){
        return productRepository.findById(id).get();
    }
    @GetMapping("/auth")
    public Authentication authentication(Authentication authentication){
        return authentication;
    }
}