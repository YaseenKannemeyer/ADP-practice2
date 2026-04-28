package za.ac.cput.adppractice2.controller;

import org.springframework.web.bind.annotation.*;
import za.ac.cput.adppractice2.service.IGetAllService;
import za.ac.cput.adppractice2.service.IService;

import java.util.List;

public abstract class BaseController<T,ID> {

    protected abstract IService<T, ID> getService();
    protected abstract IGetAllService<T> getAllService();

    @PostMapping
    public T create(@RequestBody T t){
        return getService().create(t);
    }

    @GetMapping ("/{id}")
    public T read(@PathVariable ID id){
        return getService().read(id);
    }

    @PutMapping
    public T update(@RequestBody T t){
        return getService().update(t);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ID id){
        getService().delete(id);
    }

    @GetMapping
    public List<T> gtAll(){
        return getAllService().getAll();
    }

}
