package za.ac.cput.adppractice2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.adppractice2.domain.Order;
import za.ac.cput.adppractice2.service.IGetAllService;
import za.ac.cput.adppractice2.service.IService;
import za.ac.cput.adppractice2.service.OrderService;


@RestController
@RequestMapping("/api/orders")
public class OrderController extends BaseController<Order,String>{

    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }
    @Override
    protected IService<Order, String> getService() {
        return orderService;
    }

    @Override
    protected IGetAllService<Order> getAllService() {
        return orderService;
    }
}
