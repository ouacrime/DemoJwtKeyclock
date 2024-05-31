package net.ouacrime.orderservice.repositories;

import net.ouacrime.orderservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {

}
