package za.ac.cput.adppractice2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.adppractice2.domain.InStoreOrder;
import za.ac.cput.adppractice2.service.IGetAllService;
import za.ac.cput.adppractice2.service.IService;
import za.ac.cput.adppractice2.service.InStoreOrderService;

@RestController
@RequestMapping("/api/in-store-orders")
public class InStoreOrderController extends BaseController<InStoreOrder , String> {
    private final InStoreOrderService inStoreOrderService;

    public InStoreOrderController(InStoreOrderService inStoreOrderService) {
        this.inStoreOrderService = inStoreOrderService;
    }

    @Override
    protected IService<InStoreOrder, String> getService() {
        return inStoreOrderService;
    }

    @Override
    protected IGetAllService<InStoreOrder> getAllService() {
        return inStoreOrderService;
    }
}
