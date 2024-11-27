package com.project.api.Services.Implements;

import com.project.api.DataAccess.ProductMediaRepository;
import com.project.api.Model.ProductMedia;
import com.project.api.Services.Interfaces.CrudOperations;
import com.project.api.Services.Interfaces.QueryOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductMediaService implements CrudOperations<ProductMedia>, QueryOperation<ProductMediaRepository> {
    @Autowired
    private ProductMediaRepository _repository;

    @Override
    public ProductMedia GetWithId(long id) {
        return _repository.getById(id);
    }

    @Override
    public List<ProductMedia> GetAll() {
        return _repository.findAll();
    }

    @Override
    public void Create(ProductMedia entity) {
        if(entity.getProductMediaId() !=0){
            throw new IllegalArgumentException("Cannot create an entity with Id assigned");
        }
        _repository.save(entity);

    }

    @Override
    public void Update(ProductMedia entity) {
        if(entity.getProductMediaId() ==0){
            throw new IllegalArgumentException("Cannot update an entity without Id assigned");
        }
        _repository.save(entity);
    }

    @Override
    public void Delete(ProductMedia entity) {
        if(entity.getProductMediaId() ==0){
            throw new IllegalArgumentException("Cannot delete an entity without Id assigned");
        }
        _repository.delete(entity);
    }

    @Override
    public void BulkCreate(List<ProductMedia> entities) {
        if(entities.stream().anyMatch(entity->entity.getProductMediaId() !=0)){
            throw new IllegalArgumentException("Cannot create entities with Id assigned");
        }
        _repository.saveAll(entities);
    }

    @Override
    public void BulkUpdate(List<ProductMedia> entities) {
        if(entities.stream().anyMatch(entity->entity.getProductMediaId() ==0)){
            throw new IllegalArgumentException("Cannot update entities without Id assigned");
        }
        _repository.saveAll(entities);
    }

    @Override
    public void BulkDelete(List<ProductMedia> entities) {
        if(entities.stream().anyMatch(entity->entity.getProductMediaId() ==0)){
            throw new IllegalArgumentException("Cannot delete entities without Id assigned");
        }
        _repository.deleteAll(entities);
    }

    @Override
    public ProductMediaRepository GetRepository() {
        return _repository;
    }
}
