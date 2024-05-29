package net.ouacrime.inventoryservice.web;


import net.ouacrime.inventoryservice.entities.Product;
import net.ouacrime.inventoryservice.repository.ProductReposetory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {

    private ProductReposetory productReposetory;

    public ProductRestController(ProductReposetory productReposetory)
    {
        this.productReposetory = productReposetory;
    }

    @GetMapping("/products")
    public List<Product> productList()
    {
        return productReposetory.findAll();
    }

    @GetMapping("/products/{id}")
    public Product productById(@PathVariable String id)
    {
        return productReposetory.findById(id).get();
    }




}
