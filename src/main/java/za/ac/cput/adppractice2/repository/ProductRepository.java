package za.ac.cput.adppractice2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.adppractice2.domain.Product;

public interface ProductRepository extends JpaRepository<Product,String> {
}
