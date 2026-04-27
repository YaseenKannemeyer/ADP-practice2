package za.ac.cput.adppractice2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.adppractice2.domain.OnlineOrder;
import za.ac.cput.adppractice2.service.IGetAllService;
import za.ac.cput.adppractice2.service.IService;
import za.ac.cput.adppractice2.service.OnlineOrderService;

@RestController
@RequestMapping("/api/online-orders")
public class OnlineOrderController extends BaseController<OnlineOrder, String> {

    private final OnlineOrderService onlineOrderService;

    public OnlineOrderController(OnlineOrderService onlineOrderService) {
        this.onlineOrderService = onlineOrderService;
    }
    @Override
    protected IService<OnlineOrder, String> getService() {
        return onlineOrderService;
    }

    @Override
    protected IGetAllService<OnlineOrder> getAllService() {
        return onlineOrderService;
    }
}
