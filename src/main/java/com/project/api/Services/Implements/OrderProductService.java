package com.project.api.Services.Implements;

import com.project.api.DataAccess.OrderProductRepository;
import com.project.api.Model.OrderProduct;
import com.project.api.Services.Interfaces.CrudOperations;
import com.project.api.Services.Interfaces.QueryOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderProductService implements CrudOperations<OrderProduct>, QueryOperation<OrderProductRepository> {
    @Autowired
    private OrderProductRepository _repository;


    @Override
    public OrderProduct GetWithId(long id) {
        return _repository.getById(id);
    }

    @Override
    public List<OrderProduct> GetAll() {
        return _repository.findAll();
    }

    @Override
    public void Create(OrderProduct entity) {
        if(entity.getOrderProductId() !=0){
            throw new IllegalArgumentException("Cannot create an entity with Id assigned");
        }
        _repository.save(entity);
    }

    @Override
    public void Update(OrderProduct entity) {
        if(entity.getOrderProductId() ==0){
            throw new IllegalArgumentException("Cannot update an entity without Id assigned");
        }
        _repository.save(entity);
    }

    @Override
    public void Delete(OrderProduct entity) {
        if(entity.getOrderProductId() ==0){
            throw new IllegalArgumentException("Cannot delete an entity without Id assigned");
        }
        _repository.delete(entity);
    }

    @Override
    public void BulkCreate(List<OrderProduct> entities) {
        if(entities.stream().anyMatch(entity->entity.getOrderProductId() !=0)){
            throw new IllegalArgumentException("Cannot create entities with Id assigned");
        }
        _repository.saveAll(entities);
    }

    @Override
    public void BulkUpdate(List<OrderProduct> entities) {
        if(entities.stream().anyMatch(entity->entity.getOrderProductId() ==0)){
            throw new IllegalArgumentException("Cannot update entities without Id assigned");
        }
        _repository.saveAll(entities);
    }

    @Override
    public void BulkDelete(List<OrderProduct> entities) {
        if(entities.stream().anyMatch(entity->entity.getOrderProductId() ==0)){
            throw new IllegalArgumentException("Cannot delete entities without Id assigned");
        }
        _repository.deleteAll(entities);
    }

    @Override
    public OrderProductRepository GetRepository() {
        return _repository;
    }
}
