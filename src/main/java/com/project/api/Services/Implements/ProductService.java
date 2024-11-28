package com.project.api.Services.Implements;

import com.project.api.DataAccess.Interfaces.IProductRepository;
import com.project.api.Model.Product;
import com.project.api.Services.Interfaces.CrudOperations;
import com.project.api.Services.Interfaces.QueryOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements CrudOperations<Product>, QueryOperation<IProductRepository> {
    //@Autowired
    private IProductRepository _repository;
    public ProductService(IProductRepository repository){this._repository= repository;}

    @Override
    public Product GetWithId(long id) {
        return _repository.getById(id);
    }

    @Override
    public List<Product> GetAll() {
        return _repository.findAll();
    }

    @Override
    public void Create(Product entity) {
        if(entity.getProductId() !=0){
            throw new IllegalArgumentException("Cannot create an entity with Id assigned");
        }
        _repository.save(entity);
    }

    @Override
    public void Update(Product entity) {
        if(entity.getProductId() ==0){
            throw new IllegalArgumentException("Cannot update an entity without Id assigned");
        }
        _repository.save(entity);
    }

    @Override
    public void Delete(Product entity) {
        if(entity.getProductId() ==0){
            throw new IllegalArgumentException("Cannot delete an entity without Id assigned");
        }
        _repository.delete(entity);
    }

    @Override
    public void BulkCreate(List<Product> entities) {
        if(entities.stream().anyMatch(entity->entity.getProductId() !=0)){
            throw new IllegalArgumentException("Cannot create entities with Id assigned");
        }
        _repository.saveAll(entities);
    }

    @Override
    public void BulkUpdate(List<Product> entities) {
        if(entities.stream().anyMatch(entity->entity.getProductId() ==0)){
            throw new IllegalArgumentException("Cannot update entities without Id assigned");
        }
        _repository.saveAll(entities);
    }

    @Override
    public void BulkDelete(List<Product> entities) {
        if(entities.stream().anyMatch(entity->entity.getProductId() ==0)){
            throw new IllegalArgumentException("Cannot delete entities without Id assigned");
        }
        _repository.deleteAll(entities);
    }

    @Override
    public IProductRepository GetRepository() {
        return _repository;
    }
}
