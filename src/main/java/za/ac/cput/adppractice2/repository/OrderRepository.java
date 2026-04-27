package za.ac.cput.adppractice2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.adppractice2.domain.Order;

public interface OrderRepository extends JpaRepository<Order, String> {
}
