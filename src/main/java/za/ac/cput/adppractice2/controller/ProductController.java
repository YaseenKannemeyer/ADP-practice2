package za.ac.cput.adppractice2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.adppractice2.domain.Product;
import za.ac.cput.adppractice2.service.IGetAllService;
import za.ac.cput.adppractice2.service.IService;
import za.ac.cput.adppractice2.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController extends BaseController<Product,String> {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @Override
    protected IService<Product, String> getService() {
        return productService;
    }

    @Override
    protected IGetAllService<Product> getAllService() {
        return productService;
    }


}
