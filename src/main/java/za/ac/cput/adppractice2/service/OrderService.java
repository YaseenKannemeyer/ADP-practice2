package za.ac.cput.adppractice2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.adppractice2.domain.Order;
import za.ac.cput.adppractice2.repository.OrderRepository;

import java.util.List;

@Service
public class OrderService implements IService<Order, String>, IGetAllService<Order> {
  @Autowired
  private OrderRepository orderRepository;

    @Override
    public Order create(Order order) {
       if (order == null) return null;
       return orderRepository.save(order);
    }

    @Override
    public Order read(String Id) {
        return orderRepository.findById(Id).orElse(null);
    }

    @Override
    public Order update(Order order) {
        if (order == null) return null;
        return orderRepository.save(order);
    }

    @Override
    public void delete(String Id) {
        orderRepository.deleteById(Id);
    }

    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }
}
