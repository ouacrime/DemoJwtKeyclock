package net.ouacrime.orderservice.restclients;

import net.ouacrime.orderservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "http://localhost:8080", name = "inventory-service")
public interface InventoryRestClient {

    @GetMapping("/api/products")
    List<Product> getAllProducts();
}
