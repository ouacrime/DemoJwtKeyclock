package net.ouacrime.inventoryservice.repository;

import net.ouacrime.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReposetory extends JpaRepository<Product, String>{



}
