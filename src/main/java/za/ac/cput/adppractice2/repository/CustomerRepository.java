package za.ac.cput.adppractice2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.adppractice2.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
