package za.ac.cput.adppractice2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.adppractice2.domain.OnlineOrder;
import za.ac.cput.adppractice2.domain.OrderItem;

public interface OnlineOrderRepository extends JpaRepository<OnlineOrder, String> {
}
