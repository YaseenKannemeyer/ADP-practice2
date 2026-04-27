package za.ac.cput.adppractice2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.adppractice2.domain.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,String> {
}
