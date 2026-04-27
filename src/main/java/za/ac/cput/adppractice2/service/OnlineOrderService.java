package za.ac.cput.adppractice2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.adppractice2.domain.OnlineOrder;
import za.ac.cput.adppractice2.repository.OnlineOrderRepository;

import java.util.List;

@Service
public class OnlineOrderService implements IService<OnlineOrder, String>, IGetAllService<OnlineOrder>{
    @Autowired
    private OnlineOrderRepository onlineOrderRepository;

    @Override
    public OnlineOrder create(OnlineOrder onlineOrder) {
        if (onlineOrder ==null) return null;
        return onlineOrderRepository.save(onlineOrder);
    }

    @Override
    public OnlineOrder read(String Id) {
        return onlineOrderRepository.findById(Id).orElse(null);
    }

    @Override
    public OnlineOrder update(OnlineOrder onlineOrder) {
        if (onlineOrder ==null) return null;
        return onlineOrderRepository.save(onlineOrder);
    }

    @Override
    public void delete(String Id) {
        onlineOrderRepository.deleteById(Id);
    }

    @Override
    public List<OnlineOrder> getAll() {
        return onlineOrderRepository.findAll();
    }
}
