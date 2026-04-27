package za.ac.cput.adppractice2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.adppractice2.domain.Customer;
import za.ac.cput.adppractice2.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService implements IService<Customer, String>, IGetAllService<Customer> {
    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public Customer create(Customer customer) {
        if(customer == null) return null;
        return customerRepository.save(customer);
    }

    @Override
    public Customer read(String id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer update(Customer customer) {
        if(customer == null) return null;
        return customerRepository.save(customer);

    }

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
}
