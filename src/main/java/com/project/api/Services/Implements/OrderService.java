package com.project.api.Services.Implements;

import com.project.api.DataAccess.Interfaces.IOrderRepository;
import com.project.api.Model.Order;
import com.project.api.Services.Interfaces.CrudOperations;
import com.project.api.Services.Interfaces.QueryOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements CrudOperations<Order>, QueryOperation<IOrderRepository> {
    //@Autowired
    private IOrderRepository _repository;
    public OrderService(IOrderRepository repository){this._repository=repository;}

    @Override
    public Order GetWithId(long id) {
        return _repository.getById(id);
    }

    @Override
    public List<Order> GetAll() {
        return _repository.findAll();
    }

    @Override
    public void Create(Order entity) {
        if(entity.getOrderId() !=0){
            throw new IllegalArgumentException("Cannot create an entity with Id assigned");
        }
        _repository.save(entity);
    }

    @Override
    public void Update(Order entity) {
        if(entity.getOrderId() ==0){
            throw new IllegalArgumentException("Cannot update an entity without Id assigned");
        }
        _repository.save(entity);
    }

    @Override
    public void Delete(Order entity) {
        if(entity.getOrderId() ==0){
            throw new IllegalArgumentException("Cannot delete an entity without Id assigned");
        }
        _repository.delete(entity);

    }

    @Override
    public void BulkCreate(List<Order> entities) {
        if(entities.stream().anyMatch(entity->entity.getOrderId() !=0)){
            throw new IllegalArgumentException("Cannot create entities with Id assigned");
        }
        _repository.saveAll(entities);
    }

    @Override
    public void BulkUpdate(List<Order> entities) {
        if(entities.stream().anyMatch(entity->entity.getOrderId() ==0)){
            throw new IllegalArgumentException("Cannot update entities without Id assigned");
        }
        _repository.saveAll(entities);
    }

    @Override
    public void BulkDelete(List<Order> entities) {
        if(entities.stream().anyMatch(entity->entity.getOrderId() ==0)){
            throw new IllegalArgumentException("Cannot delete entities without Id assigned");
        }
        _repository.deleteAll(entities);

    }

    @Override
    public IOrderRepository GetRepository() {
        return _repository;
    }
}
