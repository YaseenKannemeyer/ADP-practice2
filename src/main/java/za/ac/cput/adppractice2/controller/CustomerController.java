package za.ac.cput.adppractice2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.adppractice2.domain.Customer;
import za.ac.cput.adppractice2.service.CustomerService;
import za.ac.cput.adppractice2.service.IGetAllService;
import za.ac.cput.adppractice2.service.IService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController extends BaseController<Customer, String>{
   private final CustomerService customerService;

   public CustomerController(CustomerService customerService) {
       this.customerService = customerService;
   }

    @Override
    protected IService<Customer, String> getService() {
        return customerService;
    }

    @Override
    protected IGetAllService<Customer> getAllService() {
        return customerService;
    }
}
