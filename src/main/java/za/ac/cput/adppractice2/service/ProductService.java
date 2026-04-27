package za.ac.cput.adppractice2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.adppractice2.domain.Product;
import za.ac.cput.adppractice2.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService implements IService<Product,String>,IGetAllService<Product>{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product create(Product product) {
        if (product == null) return null;
        return productRepository.save(product);
    }

    @Override
    public Product read(String Id) {
        return productRepository.findById(Id).orElse(null);
    }

    @Override
    public Product update(Product product) {
        if (product == null) return null;
        return productRepository.save(product);
    }

    @Override
    public void delete(String Id) {
        productRepository.deleteById(Id);
    }

    @Override
    public List getAll() {
        return productRepository.findAll();
    }
}
