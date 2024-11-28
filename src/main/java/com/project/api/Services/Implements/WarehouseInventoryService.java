package com.project.api.Services.Implements;

import com.project.api.DataAccess.Interfaces.IWarehouseInventoryRepository;
import com.project.api.Model.WarehouseInventory;
import com.project.api.Services.Interfaces.CrudOperations;
import com.project.api.Services.Interfaces.QueryOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseInventoryService implements CrudOperations<WarehouseInventory>, QueryOperation<IWarehouseInventoryRepository> {
    //@Autowired
    private IWarehouseInventoryRepository _repository;
    public WarehouseInventoryService(IWarehouseInventoryRepository repository ){this._repository = repository;}

    @Override
    public WarehouseInventory GetWithId(long id) {
        return _repository.findById(id).orElse(null);
    }

    @Override
    public List<WarehouseInventory> GetAll() {
        return _repository.findAll();
    }

    @Override
    public void Create(WarehouseInventory entity) {
        if(entity.getWarehouseInventoryId() !=0){
            throw new IllegalArgumentException("Cannot save entity with ID assigned");
        }
        _repository.save(entity);
    }

    @Override
    public void Update(WarehouseInventory entity) {
        if(entity.getWarehouseInventoryId() ==0){
            throw new IllegalArgumentException("Cannot update entity without ID assigned");
        }
        _repository.save(entity);
    }

    @Override
    public void Delete(WarehouseInventory entity) {
        if(entity.getWarehouseInventoryId() ==0){
            throw new IllegalArgumentException("Cannot delete entity without ID assigned");
        }
        _repository.delete(entity);
    }

    @Override
    public void BulkCreate(List<WarehouseInventory> entities) {
        if(entities.stream().anyMatch(entity -> entity.getWarehouseInventoryId()!=0)){
            throw new IllegalArgumentException("Cannot save entities with ID assigned ");
        }
        _repository.saveAll(entities);
    }

    @Override
    public void BulkUpdate(List<WarehouseInventory> entities) {
        if(entities.stream().anyMatch(entity -> entity.getWarehouseInventoryId()==0)){
            throw new IllegalArgumentException("Cannot update entities without ID assigned ");
        }
        _repository.saveAll(entities);
    }

    @Override
    public void BulkDelete(List<WarehouseInventory> entities) {
        if(entities.stream().anyMatch(entity -> entity.getWarehouseInventoryId()==0)){
            throw new IllegalArgumentException("Cannot delete entities without ID assigned ");
        }
        _repository.deleteAll(entities);
    }
    @Override
    public IWarehouseInventoryRepository GetRepository() {
        return _repository;
    }
}
