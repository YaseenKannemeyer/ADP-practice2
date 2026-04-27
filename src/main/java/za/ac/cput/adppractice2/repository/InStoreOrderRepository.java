package za.ac.cput.adppractice2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.adppractice2.domain.InStoreOrder;

public interface InStoreOrderRepository extends JpaRepository<InStoreOrder,String> {
}
