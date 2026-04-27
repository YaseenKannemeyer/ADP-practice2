package za.ac.cput.adppractice2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.adppractice2.domain.OrderItem;
import za.ac.cput.adppractice2.repository.OrderItemRepository;

import java.util.List;

@Service
public class OrderItemService implements IService<OrderItem, String>, IGetAllService<OrderItem>{
    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public OrderItem create(OrderItem orderItem) {
       if (orderItem == null) return null;
       return orderItemRepository.save(orderItem);
    }

    @Override
    public OrderItem read(String Id) {
        return orderItemRepository.findById(Id).orElse(null);
    }

    @Override
    public OrderItem update(OrderItem orderItem) {
        if (orderItem == null) return null;
        return orderItemRepository.save(orderItem);
    }

    @Override
    public void delete(String Id) {
        orderItemRepository.deleteById(Id);
    }

    @Override
    public List<OrderItem> getAll() {
        return orderItemRepository.findAll();
    }
}
