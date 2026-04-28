package za.ac.cput.adppractice2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.adppractice2.domain.OrderItem;
import za.ac.cput.adppractice2.service.IGetAllService;
import za.ac.cput.adppractice2.service.IService;
import za.ac.cput.adppractice2.service.OrderItemService;

@RestController
@RequestMapping("/api/order-items")
public class OrderItemController extends BaseController<OrderItem, String>{

    private final OrderItemService orderItemService;

    public OrderItemController(OrderItemService orderItemService){
        this.orderItemService = orderItemService;
    }

    @Override
    protected IService<OrderItem, String> getService() {
        return orderItemService;
    }

    @Override
    protected IGetAllService<OrderItem> getAllService() {
        return orderItemService;
    }
}
