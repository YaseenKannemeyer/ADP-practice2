package za.ac.cput.adppractice2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.adppractice2.domain.InStoreOrder;
import za.ac.cput.adppractice2.repository.InStoreOrderRepository;

import java.util.List;

@Service
public class InStoreOrderService implements IService<InStoreOrder, String>,IGetAllService<InStoreOrder>{

    @Autowired
    private InStoreOrderRepository inStoreOrderRepository;


    @Override
    public InStoreOrder create(InStoreOrder inStoreOrder) {
        if (inStoreOrder == null) return null;
        return inStoreOrderRepository.save(inStoreOrder);
    }

    @Override
    public InStoreOrder read(String Id) {
        return inStoreOrderRepository.findById(Id).orElse(null);
    }

    @Override
    public InStoreOrder update(InStoreOrder inStoreOrder) {
        if (inStoreOrder == null) return null;
        return inStoreOrderRepository.save(inStoreOrder);
    }

    @Override
    public void delete(String id) {
        inStoreOrderRepository.deleteById(id);

    }

    @Override
    public List<InStoreOrder> getAll() {
        return List.of();
    }
}
