package net.ouacrime.inventoryservice;

import net.ouacrime.inventoryservice.entities.Product;
import net.ouacrime.inventoryservice.repository.ProductReposetory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(ProductReposetory productReposetory)
    {
        return args -> {
            productReposetory.save(Product.builder().id(UUID.randomUUID().toString()).name("computer").price(2300).quantity(12).build());
            productReposetory.save(Product.builder().id(UUID.randomUUID().toString()).name("printer").price(1500).quantity(6).build());
            productReposetory.save(Product.builder().id(UUID.randomUUID().toString()).name("smart phone").price(5200).quantity(18).build());

        };
    }




}
